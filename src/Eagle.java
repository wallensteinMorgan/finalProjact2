import java.util.Random;

public class Eagle extends Predator {

    public Eagle(Island island, int x, int y,double weight) {
        super("Орел", 1, island, x, y,6);  // Волк – плотоядное животное с максимальным голодом 1
    }

    @Override
    protected Animal createOffspring() {
        return new Eagle(island, x, y,weight);  // Создание потомка
    }
    public static void generateEagle(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 20);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Eagle eagle = new Eagle(island, x, y, 6);
            island.getLocation(x, y).addAnimals(eagle);
            Thread eagleThread = new Thread(eagle);
            eagleThread.start();
        }
    }
}
