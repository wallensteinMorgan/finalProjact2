package place;

import animals.*;
import animals.herbivore.*;
import animals.predator.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Класс локации, представляющий одну клетку острова
public class Location {
    private List<Animal> animals; // Список животных, находящихся в этой локации
    private List<Plants> plants;// Список растений, находящихся в этой локации

    public Location() {
        animals = new ArrayList<>();
        plants = new ArrayList<>();
        // Добавление случайного количества растений в локацию
        Random random = new Random();
        int plantCount = random.nextInt(200); // максимальное число растений от 0 до 200
        for (int i = 0; i < plantCount; i++) {
            addPlants(new Plants());
        }
    }
    // Возвращает список животных, находящихся в этой локации
    public synchronized List<Animal> getAnimals() {
        return animals;
    }
    // Возвращает список растений, находящихся в этой локации
    public synchronized List<Plants> getPlants() {
        return plants;
    }

    public synchronized void addAnimals(Animal animal) {

            switch (animal) {
                case Wolf wolf -> {
                    long wolfCount = animals.stream().filter(a -> a instanceof Wolf).count();
                    if (wolfCount >= 30) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Bear bear -> {
                    Long bearCount = animals.stream().filter(a -> a instanceof Bear).count();
                    if (bearCount >= 5) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 5
                    }
                    animals.add(animal);
                }
                case Boa boa -> {
                    Long boaCount = animals.stream().filter(a -> a instanceof Boa).count();
                    if (boaCount >= 30) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Buffalo buffalo -> {
                    Long buffaloCount = animals.stream().filter(a -> a instanceof Buffalo).count();
                    if (buffaloCount >= 10) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Caterpillar caterpillar -> {
                    Long caterpillarCount = animals.stream().filter(a -> a instanceof Caterpillar).count();
                    if (caterpillarCount >= 1000) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Deer deer -> {
                    Long deerCount = animals.stream().filter(a -> a instanceof Deer).count();
                    if (deerCount >= 20) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Duck duck -> {
                    Long duckCount = animals.stream().filter(a -> a instanceof Duck).count();
                    if (duckCount >= 200) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Eagle eagle -> {
                    Long eagleCount = animals.stream().filter(a -> a instanceof Eagle).count();
                    if (eagleCount >= 20) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Fox fox -> {
                    Long foxCount = animals.stream().filter(a -> a instanceof Fox).count();
                    if (foxCount >= 30) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Goat goat -> {
                    Long goatCount = animals.stream().filter(a -> a instanceof Goat).count();
                    if (goatCount >= 140) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Horse horse -> {
                    Long horseCount = animals.stream().filter(a -> a instanceof Horse).count();
                    if (horseCount >= 20) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Rabbit rabbit -> {
                    Long rabbitCount = animals.stream().filter(a -> a instanceof Rabbit).count();
                    if (rabbitCount >= 150) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Sheep sheep -> {
                    Long sheepCount = animals.stream().filter(a -> a instanceof Sheep).count();
                    if (sheepCount >= 140) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case WildBoar wildBoar -> {
                    Long wildboarCount = animals.stream().filter(a -> a instanceof WildBoar).count();
                    if (wildboarCount >= 50) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                case Mouse mouse -> {
                    Long mouseCount = animals.stream().filter(a -> a instanceof Mouse).count();
                    if (mouseCount >= 500) {
                        System.out.println("Максимальное количество волков на клетке достигнуто.");
                        return;  // Не добавляем волка, если их уже 30
                    }
                    animals.add(animal);
                }
                default -> {
                    throw new IllegalArgumentException("Неизвестный тип животного: " + animal.getClass().getSimpleName());

            }
        }

    }
    public synchronized void removeAnimal(Animal animal) {

            animals.remove(animal);

    }

    public synchronized void addPlants(Plants plant) {

            plants.add(plant);

    }
    public synchronized void removePlant(Plants plant) {

            plants.remove(plant);

    }

    @Override
    public String toString() {
        return "place.Location{" +
                "animals=" + animals.size() +
                ", plants=" + plants.size() +
                '}';
    }
}

