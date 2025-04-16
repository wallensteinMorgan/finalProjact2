package animals.predator;

import animals.Animal;
import animals.Predator;
import place.Island;

import java.util.Random;

public class Bear extends Predator {

    public Bear(Island island, int x, int y, double weight) {
        super("Медведь", 80, island, x, y,500);  // Медведь – плотоядное животное с максимальным голодом 80
    }

    @Override
    protected Animal createOffspring() {
        return new Bear(island, x, y,weight);  // Создание потомка
    }

    public static void generateBear(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 5);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Bear bear = new Bear(island, x, y, 500);
            island.getLocation(x, y).addAnimals(bear);
            Thread bearThread = new Thread(bear);
            bearThread.start();
        }
    }
}
