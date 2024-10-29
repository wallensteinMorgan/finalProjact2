public class Goat extends Herbivore {
    public Goat(Island island, int x, int y,double weight) {
        super("Коза", 10, island, x, y,	60);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Goat(island, x, y,weight);  // Создание потомка
    }

}
