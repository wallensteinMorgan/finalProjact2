package animals.predator;

import animals.Animal;
import animals.Predator;
import place.Island;

import java.util.Random;

public class Wolf  extends Predator {

    public Wolf(Island island, int x, int y, double weight) {
        super("Волк", 8, island, x, y, 50);  // Волк – плотоядное животное с максимальным голодом 8
    }

    public static void generateWolf (Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2,30);
        for(int i =0; i<nextInt; i++){
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Wolf wolf = new Wolf(island, x, y, 50);
            island.getLocation(x, y).addAnimals(wolf);
            Thread wolfThread = new Thread(wolf);
            wolfThread.start();
        }

    }
    @Override
    protected Animal createOffspring() {
        return new Wolf(island, x, y, weight);  // Создание потомка
    }
}