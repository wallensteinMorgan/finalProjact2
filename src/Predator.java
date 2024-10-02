import java.util.List;
import java.util.Random;

public class Predator extends Animal {
    public Predator(String name, double maxHunger, Island island, int x, int y, double weight) {
        super(name, maxHunger, island, x, y, weight);
    }
    // Метод поедания для плотоядных – они едят травоядных
    @Override
    public void eat(Location location) {
        List<Animal> animals = location.getAnimals();
        for (Animal animal : animals) {
            if (animal instanceof Herbivore && animal.isAlive()) { // Проверяем, есть ли травоядные
                location.removeAnimal(animal); // Удаляем травоядное, так как оно было съедено
                hunger = 0; // Сбрасываем голод
                System.out.println(name + " ест " + animal.getName() + ".");
                return;
            }
        }
        System.out.println(name + " не нашел подходящей пищи.");
        increaseHunger(); // если еды нет, увеличивается голод
    }
    // Метод размножения для плотоядных
    @Override
    public void reproduce(Location location) {
        long count = location.getAnimals().stream().filter(a -> a.getClass() == this.getClass()).count();
        if (count > 1 && alive) {// Проверяем наличие других плотоядных
            System.out.println(name + " размножается.");
            location.addAnimals(createOffspring());// Добавляем новое животное
        }
    }
    // Метод случайного движения
    @Override
    public void move (Island island) {
        Random random = new Random();
        int newX = x + random.nextInt(3) - 1; // случайное смещение по x
        int newY = y + random.nextInt(3) - 1; // случайное смещение по y

        Location newLocation = island.getLocation(newX, newY);
        if (newLocation != null && alive) {
            System.out.println(name + " перемещается в новую локацию.");
            island.getLocation(x, y).removeAnimal(this);
            newLocation.addAnimals(this);
            x = newX;
            y = newY;
        }
    }
    // Метод для создания потомства плотоядного
    @Override
    protected Animal createOffspring() {
        return new Predator(name + " потомок", maxHunger, island, x, y, weight);
    }
}
