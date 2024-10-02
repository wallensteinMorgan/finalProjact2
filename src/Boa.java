public class Boa extends Predator {

    public Boa(Island island, int x, int y,double weight) {
        super("Удав", 3, island, x, y,15);  // Волк – плотоядное животное с максимальным голодом 3
    }

    @Override
    protected Animal createOffspring() {
        return new Boa(island, x, y,weight);  // Создание потомка волка
    }
}
