package animals.herbivore;

import animals.Animal;
import animals.Herbivore;
import place.Island;

import java.util.Random;

public class Horse extends Herbivore {
    public Horse(Island island, int x, int y, double weight) {
        super("Лошадь", 60, island, x, y,400);  // Лошадь – травоядное животное с максимальным голодом 60
    }

    @Override
    protected Animal createOffspring() {
        return new Horse(island, x, y, weight);  // Создание потомка
    }
    public static void generateHorse(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 20);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Horse horse = new Horse(island, x, y, 400);
            island.getLocation(x, y).addAnimals(horse);
            Thread horseThread = new Thread(horse);
            horseThread.start();
        }
    }

}
