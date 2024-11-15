package animals.predator;

import animals.Animal;
import animals.Predator;
import place.Island;

import java.util.Random;

public class Boa extends Predator {

    public Boa(Island island, int x, int y, double weight) {
        super("Удав", 3, island, x, y,15);  // Удав – плотоядное животное с максимальным голодом 3
    }

    @Override
    protected Animal createOffspring() {
        return new Boa(island, x, y,weight);  // Создание потомка
    }

    public static void generateBoa(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 30);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Boa boa = new Boa(island, x, y, 15);
            island.getLocation(x, y).addAnimals(boa);
            Thread boaThread = new Thread(boa);
            boaThread.start();
        }
    }
}
