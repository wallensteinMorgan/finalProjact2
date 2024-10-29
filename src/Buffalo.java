public class Buffalo extends Herbivore {
    public Buffalo(Island island, int x, int y,double weight) {
        super("Буйвол", 100, island, x, y,700);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Buffalo(island, x, y,weight);  // Создание потомка
    }

}
