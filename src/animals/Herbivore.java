package animals;

import place.Island;
import place.Location;

import java.util.Random;
public class Herbivore extends Animal {

    public Herbivore(String name, double maxHunger, Island island, int x, int y, double weight) {
        super(name, maxHunger, island, x, y, weight);
    }
    // Метод поедания для травоядных – они едят растения
    @Override
    public void eat(Location location) {
        if (!location.getPlants().isEmpty()) {  // Проверяем, есть ли растения в локации
            Plants plant = location.getPlants().get(0);
            location.removePlant(plant); // Удаляем растение, так как животное его съело
            hunger = 0; // после еды голод сбрасывается
            System.out.println(name + " ест растение.");
        } else {
            System.out.println(name + " не нашел еды.");
            increaseHunger(); // если еды нет, увеличивается голод
        }
    }
    // Метод размножения для травоядных
    @Override
    public void reproduce(Location location) {
        long count = location.getAnimals().stream().filter(a -> a.getClass() == this.getClass()).count();
        if (count > 1 && alive) {  //Проверяем, есть ли рядом другие особи того же типа
            System.out.println(name + " размножается.");
            location.addAnimals(createOffspring());// Добавляем новое животное в локацию
        }
    }
    // Метод движения – случайный выбор направления
    @Override
    public void move (Island island) {
        Random random = new Random();
        int newX = x + random.nextInt(4) - 1; // случайное смещение по x
        int newY = y + random.nextInt(4) - 1; // случайное смещение по y

        Location newLocation = island.getLocation(newX, newY);
        if (newLocation != null && alive) {  // Проверяем, можно ли переместиться в новую локацию
            System.out.println(name + " перемещается в новую локацию.");
            island.getLocation(x, y).removeAnimal(this);// Удаляем животное из старой локации
            newLocation.addAnimals(this);
            x = newX;  // Обновляем координаты животного
            y = newY;
        }
    }
    // Метод для создания потомства травоядного
    @Override
    protected Animal createOffspring() {
        return new Herbivore(name + " потомок", maxHunger, island, x, y, weight);
    }

}
