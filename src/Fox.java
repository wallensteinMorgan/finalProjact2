import java.util.Random;

public class Fox extends Predator  {

    public Fox(Island island, int x, int y,double weight) {
        super("Лиса", 2, island, x, y,8);  // Волк – плотоядное животное с максимальным голодом 2
    }

    @Override
    protected Animal createOffspring() {
        return new Fox(island, x, y,weight);  // Создание потомка
    }
    public static void generateFox(Island island, int width, int height) {
        Random random = new Random();
        int nextInt = random.nextInt(2, 30);
        for (int i = 0; i < nextInt; i++) {
            int x = random.nextInt(1, width);
            int y = random.nextInt(1, height);
            Fox fox = new Fox(island, x, y, 8);
            island.getLocation(x, y).addAnimals(fox);
            Thread foxThread = new Thread(fox);
            foxThread.start();
        }
    }
}
