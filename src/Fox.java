public class Fox extends Predator  {

    public Fox(Island island, int x, int y,double weight) {
        super("Лиса", 2, island, x, y,8);  // Волк – плотоядное животное с максимальным голодом 2
    }

    @Override
    protected Animal createOffspring() {
        return new Fox(island, x, y,weight);  // Создание потомка волка
    }
}
