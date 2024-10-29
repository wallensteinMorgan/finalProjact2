import java.util.Random;

public class Mouse extends Herbivore {
    public Mouse(Island island, int x, int y, double weight) {
        super("Мышь", 0.01, island, x, y, 0.05);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Mouse(island, x, y, weight);  // Создание потомка
    }
    public static void generateMouser(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 500);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Mouse mouse = new Mouse(island, x, y, 0.05);
            island.getLocation(x, y).addAnimals(mouse);
            Thread mouseThread = new Thread(mouse);
            mouseThread.start();
        }
    }

}
