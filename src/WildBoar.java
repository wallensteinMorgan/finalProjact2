public class WildBoar extends Herbivore {
    public WildBoar(Island island, int x, int y, double weight) {
        super("Кабан", 50, island, x, y,400);  // Волк – плотоядное животное с максимальным голодом 50
    }

    @Override
    protected Animal createOffspring() {
        return new WildBoar(island, x, y, weight);  // Создание потомка
    }
}
