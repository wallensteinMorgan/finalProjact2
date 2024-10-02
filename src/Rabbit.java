public class Rabbit  extends Herbivore {
    public Rabbit(Island island, int x, int y,double weight) {
        super("Кролик", 0.45, island, x, y,2);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Rabbit(island, x, y,weight);  // Создание потомка волка
    }

}
