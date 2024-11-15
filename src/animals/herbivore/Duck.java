package animals.herbivore;

import animals.Animal;
import animals.Herbivore;
import place.Island;

import java.util.Random;

public class Duck  extends Herbivore {
    public Duck(Island island, int x, int y, double weight) {
        super("Утка", 0.15, island, x, y,1);  // Утка – травоядное животное с максимальным голодом 0,15
    }

    @Override
    protected Animal createOffspring() {
        return new Duck(island, x, y,weight);  // Создание потомка
    }

    public static void generateDuck(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 200);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Duck duck = new Duck(island, x, y, 1);
            island.getLocation(x, y).addAnimals(duck);
            Thread duckThread = new Thread(duck);
            duckThread.start();
        }
    }

}
