import java.util.Random;

public class Buffalo extends Herbivore {
    public Buffalo(Island island, int x, int y,double weight) {
        super("Буйвол", 100, island, x, y,700);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Buffalo(island, x, y,weight);  // Создание потомка
    }
    public static void generateBuffalo(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 10);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Buffalo buffalo = new Buffalo(island, x, y, 700);
            island.getLocation(x, y).addAnimals(buffalo);
            Thread buffaloThread = new Thread(buffalo);
            buffaloThread.start();
        }
    }

}
