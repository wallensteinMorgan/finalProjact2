package animals.herbivore;

import animals.Animal;
import animals.Herbivore;
import place.Island;

import java.util.Random;

public class Rabbit  extends Herbivore {
    public Rabbit(Island island, int x, int y, double weight) {
        super("Кролик", 0.45, island, x, y,2);  // Кролик – травоядное животное с максимальным голодом 0,45
    }

    @Override
    protected Animal createOffspring() {
        return new Rabbit(island, x, y,weight);  // Создание потомка
    }
    public static void generateRabbit(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 150);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Rabbit rabbit = new Rabbit(island, x, y, 2);
            island.getLocation(x, y).addAnimals(rabbit);
            Thread rabbitThread = new Thread(rabbit);
            rabbitThread.start();
        }
    }

}
