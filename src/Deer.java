public class Deer extends Herbivore {
    public Deer(Island island, int x, int y,double weight) {
        super("Олень", 50, island, x, y,300);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Deer(island, x, y,weight);  // Создание потомка волка
    }

}
