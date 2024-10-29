public class Caterpillar extends Herbivore {
    public Caterpillar(Island island, int x, int y,double weight) {
        super("Гусеница", 0.01, island, x, y,1);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Caterpillar(island, x, y,weight);  // Создание потомка
    }
}
