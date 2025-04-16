package animals;

import animals.interfaceOfCommand.Eat;
import animals.interfaceOfCommand.Movement;
import animals.interfaceOfCommand.Reproduction;
import place.Island;

public abstract class Animal implements Runnable, Eat, Movement, Reproduction {
    protected String name; // Имя животного
    protected double hunger;  // Уровень голода
    protected double maxHunger; // Максимальный уровень голода (критический)
    protected boolean alive = true;// Флаг жизни животного
    protected Island island;// Остров, на котором живёт животное
    protected int x, y; // Координаты животного на острове
    protected double weight; //Вес животного

    public Animal(String name, double maxHunger, Island island, int x, int y, double weight) {
        this.name = name;
        this.maxHunger = maxHunger;
        this.hunger = 0; // Начальный уровень голода (животное не голодно)
        this.island = island;
        this.x = x;
        this.y = y;
        this.weight = weight;
    }
    // Проверка, живо ли животное
    public boolean isAlive() {
        return alive;
    }
    // Проверка, голодно ли животное
    public boolean isHungry() {
        return hunger >= maxHunger;
    }

    // Увеличение уровня голода. Если он превышает максимальный, животное умирает
    public void increaseHunger() {
        hunger++;
        if (hunger >= maxHunger) {
            alive = false;
            System.out.println(name + " умер от голода.");
        }
    }
    // Основной метод жизнедеятельности животного (используется в многопоточности)
    @Override
    public void run() {
        while (alive) { // Пока животное живо, оно повторяет цикл действий
            try {
                eat(island.getLocation(x, y));  // Животное пытается поесть
                move(island); // Животное выбирает направление и перемещается
                reproduce(island.getLocation(x, y));// Животное размножается
                increaseHunger(); // Животное становится более голодным
                Thread.sleep(1000); // Задержка для симуляции времени
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public String getName() {
        return name;
    }
    // Абстрактный метод для создания потомства, который реализуется в подклассах
    protected abstract Animal createOffspring();

}
