public class Mouse extends Herbivore {
    public Mouse(Island island, int x, int y, double weight) {
        super("Мышь", 0.01, island, x, y, 0.05);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Mouse(island, x, y, weight);  // Создание потомка
    }

}
