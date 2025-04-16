package animals.herbivore;

import animals.Animal;
import animals.Herbivore;
import place.Island;

import java.util.Random;

public class Sheep extends Herbivore {
    public Sheep(Island island, int x, int y, double weight) {
        super("Овца", 15, island, x, y,70);  // Овца – травоядное животное с максимальным голодом 15
    }

    @Override
    protected Animal createOffspring() {
        return new Sheep(island, x, y,weight);  // Создание потомка
    }
    public static void generateSheep(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 140);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Sheep sheep = new Sheep(island, x, y, 70);
            island.getLocation(x, y).addAnimals(sheep);
            Thread sheepThread = new Thread(sheep);
            sheepThread.start();
        }
    }

}
