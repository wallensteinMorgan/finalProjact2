import java.util.Random;

public class Caterpillar extends Herbivore {
    public Caterpillar(Island island, int x, int y,double weight) {
        super("Гусеница", 0, island, x, y,0.01);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Caterpillar(island, x, y,weight);  // Создание потомка
    }
    public static void generateCaterpillar(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 1000);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Caterpillar caterpillar = new Caterpillar(island, x, y, 0.01);
            island.getLocation(x, y).addAnimals(caterpillar);
            Thread caterpillarThread = new Thread(caterpillar);
            caterpillarThread.start();
        }
    }
}
