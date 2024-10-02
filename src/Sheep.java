public class Sheep extends Herbivore {
    public Sheep(Island island, int x, int y,double weight) {
        super("Овца", 15, island, x, y,70);  // Волк – плотоядное животное с максимальным голодом 8
    }

    @Override
    protected Animal createOffspring() {
        return new Sheep(island, x, y,weight);  // Создание потомка волка
    }

}
