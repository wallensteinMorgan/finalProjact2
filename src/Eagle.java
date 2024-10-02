public class Eagle extends Predator {

    public Eagle(Island island, int x, int y,double weight) {
        super("Орел", 1, island, x, y,6);  // Волк – плотоядное животное с максимальным голодом 1
    }

    @Override
    protected Animal createOffspring() {
        return new Eagle(island, x, y,weight);  // Создание потомка волка
    }
}
