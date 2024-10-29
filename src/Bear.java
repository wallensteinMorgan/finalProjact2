public class Bear extends Predator {

    public Bear(Island island, int x, int y,double weight) {
        super("Медведь", 80, island, x, y,500);  // Волк – плотоядное животное с максимальным голодом 3
    }

    @Override
    protected Animal createOffspring() {
        return new Bear(island, x, y,weight);  // Создание потомка
    }
}
