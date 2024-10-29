public class Wolf  extends Predator {

    public Wolf(Island island, int x, int y, double weight) {
        super("Волк", 8, island, x, y, 50);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Wolf(island, x, y, weight);  // Создание потомка
    }
}