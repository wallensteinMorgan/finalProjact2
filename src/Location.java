import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// Класс локации, представляющий одну клетку острова
class Location {
    private List<Animal> animals; // Список животных, находящихся в этой локации
    private List<Plants> plants;// Список растений, находящихся в этой локации

    public Location() {
        animals = new ArrayList<>();
        plants = new ArrayList<>();
        // Добавление случайного количества растений в локацию
        Random random = new Random();
        int plantCount = random.nextInt(200); // максимальное число растений от 0 до 200
        for (int i = 0; i < plantCount; i++) {
            plants.add(new Plants());
        }
    }
    // Возвращает список животных, находящихся в этой локации
    public List<Animal> getAnimals() {
        return animals;
    }
    // Возвращает список растений, находящихся в этой локации
    public List<Plants> getPlants() {
        return plants;
    }

    // Метод для определения типа животного
    private AnimalType getAnimalType(Animal animal) {
        if (animal instanceof Wolf) {
            return AnimalType.WOLF;
        } else if (animal instanceof Herbivore) {
            return AnimalType.HERBIVORE;
        } else {
            return AnimalType.OTHER;
        }
    }
    public void addAnimals(Animal animal) {
        AnimalType type = getAnimalType(animal);
        switch (type) {
            case WOLF:
                long wolfCount = animals.stream().filter(a -> a instanceof Wolf).count();
                if (wolfCount >= 30) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case BEAR:
                Long bearCount = animals.stream().filter(a -> a instanceof Bear).count();
                if (bearCount >= 5) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case BOA:
                Long boaCount = animals.stream().filter(a -> a instanceof Boa).count();
                if (boaCount >= 30) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case BUFFALO:
                Long buffaloCount = animals.stream().filter(a -> a instanceof Buffalo).count();
                if (buffaloCount >= 10) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case CATERPILLAR:
                Long caterpillarCount = animals.stream().filter(a -> a instanceof Caterpillar).count();
                if (caterpillarCount >= 1000) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case DEER:
                Long deerCount = animals.stream().filter(a -> a instanceof Deer).count();
                if (deerCount >= 20) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case DUCK:
                Long duckCount = animals.stream().filter(a -> a instanceof Duck).count();
                if (duckCount >= 200) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case EAGLE:
                Long eagleCount = animals.stream().filter(a -> a instanceof Eagle).count();
                if (eagleCount >= 20) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case FOX:
                Long foxCount = animals.stream().filter(a -> a instanceof Fox).count();
                if (foxCount >= 30) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case GOAT:
                Long goatCount = animals.stream().filter(a -> a instanceof Goat).count();
                if (goatCount >= 140) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case HORSE:
                Long horseCount = animals.stream().filter(a -> a instanceof Horse).count();
                if (horseCount >= 20) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case RABBIT:
                Long rabbitCount = animals.stream().filter(a -> a instanceof Rabbit).count();
                if (rabbitCount >= 150) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case SHEEP:
                Long sheepCount = animals.stream().filter(a -> a instanceof Sheep).count();
                if (sheepCount >= 140) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case WILDBOAR:
                Long wildboarCount = animals.stream().filter(a -> a instanceof WildBoar).count();
                if (wildboarCount >= 50) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;
            case MOUSE:
                Long mouseCount = animals.stream().filter(a -> a instanceof Mouse).count();
                if (mouseCount >= 500) {
                    System.out.println("Максимальное количество волков на клетке достигнуто.");
                    return;  // Не добавляем волка, если их уже 30
                }
                animals.add(animal);
                break;


            default:
                throw new IllegalArgumentException("Неизвестный тип животного: " + animal.getClass().getSimpleName());
        }

    }
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    public void addPlants(Plants plant) {
        plants.add(plant);
    }
    public void removePlant(Plants plant) {
        plants.remove(plant);
    }

    @Override
    public String toString() {
        return "Location{" +
                "animals=" + animals.size() +
                ", plants=" + plants.size() +
                '}';
    }
}

