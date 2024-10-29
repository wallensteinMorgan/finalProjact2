import java.util.Random;

public class Goat extends Herbivore {
    public Goat(Island island, int x, int y,double weight) {
        super("Коза", 10, island, x, y,	60);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Goat(island, x, y,weight);  // Создание потомка
    }
    public static void generateGoat(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 140);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Goat goat = new Goat(island, x, y, 60);
            island.getLocation(x, y).addAnimals(goat);
            Thread goatThread = new Thread(goat);
            goatThread.start();
        }
    }

}
