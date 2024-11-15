package animals.herbivore;

import animals.Animal;
import animals.Herbivore;
import place.Island;

import java.util.Random;

public class Deer extends Herbivore {
    public Deer(Island island, int x, int y, double weight) {
        super("Олень", 50, island, x, y,300);  // Олень – травоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Deer(island, x, y,weight);  // Создание потомка
    }

    public static void generateDeer(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 20);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Deer deer = new Deer(island, x, y, 300);
            island.getLocation(x, y).addAnimals(deer);
            Thread deerThread = new Thread(deer);
            deerThread.start();
        }
    }

}
