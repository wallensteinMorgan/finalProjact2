package animals.herbivore;

import animals.Animal;
import animals.Herbivore;
import place.Island;

import java.util.Random;

public class WildBoar extends Herbivore {
    public WildBoar(Island island, int x, int y, double weight) {
        super("Кабан", 50, island, x, y, 400);  // Кабан – травоядное животное с максимальным голодом 50
    }

    @Override
    protected Animal createOffspring() {
        return new WildBoar(island, x, y, weight);  // Создание потомка
    }

    public static void generateWildBoar(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 50);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            WildBoar wildBoar = new WildBoar(island, x, y, 400);
            island.getLocation(x, y).addAnimals(wildBoar);
            Thread wildBoarThread = new Thread(wildBoar);
            wildBoarThread.start();
        }
    }
}
