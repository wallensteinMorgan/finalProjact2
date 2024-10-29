public class Horse extends Herbivore {
    public Horse(Island island, int x, int y, double weight) {
        super("Лошадь", 60, island, x, y,400);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Horse(island, x, y, weight);  // Создание потомка
    }

}
