public class Duck  extends Herbivore {
    public Duck(Island island, int x, int y,double weight) {
        super("Утка", 0.15, island, x, y,1);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Duck(island, x, y,weight);  // Создание потомка волка
    }

}
