import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        // Создаем остров размером
        int width;
        int height;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        System.out.println("Задаем параметры острова");
        try {
            out.println("Введите длину");
            height = Integer.parseInt(br.readLine());
            out.println("Введите ширину");
            width = Integer.parseInt(br.readLine());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Island island = new Island(height, width);

        // Добавляем животных на остров
        Boa boa = new Boa(island, 2, 2,15);     // Создаем удава на координатах (3, 3)
        Fox fox = new Fox(island, 3,3,8);
        Bear bear = new Bear(island, 5,5,500);
        Eagle eagle = new Eagle(island, 4,4,6);
        Horse horse = new Horse(island,6,6,400);
        Goat goat = new Goat(island,7,7,60);
        Rabbit rabbit = new Rabbit(island,9,9,2);
        Mouse mouse = new Mouse(island, 8,8,0.05);
        Deer deer = new Deer(island,8,8,300);
        Sheep sheep = new Sheep(island,10,10,70);
        WildBoar wildBoar = new WildBoar(island,6,6,400);
        Buffalo buffalo = new Buffalo(island,2,2,700);
        Duck duck = new Duck(island,7,7,1);
        Caterpillar caterpillar = new Caterpillar(island ,5,5,0.01);


        // Добавляем животных в соответствующие локации
        island.getLocation(2, 2).addAnimals(boa);   // Добавляем удава в локацию (3, 3)
        island.getLocation(3, 3).addAnimals(fox);
        island.getLocation(5, 5).addAnimals(bear);
        island.getLocation(4, 4).addAnimals(eagle);
        island.getLocation(6, 6).addAnimals(horse);
        island.getLocation(7, 7).addAnimals(goat);
        island.getLocation(9, 9).addAnimals(rabbit);
        island.getLocation(8, 8).addAnimals(mouse);
        island.getLocation(8, 8).addAnimals(deer);
        island.getLocation(10, 10).addAnimals(sheep);
        island.getLocation(6, 6).addAnimals(wildBoar);
        island.getLocation(2, 2).addAnimals(buffalo);
        island.getLocation(7, 7).addAnimals(duck);
        island.getLocation(5, 5).addAnimals(caterpillar);

        // Запускаем потоки для каждого животного
        Thread boaThread = new Thread(boa);
        Thread foxThread = new Thread(fox);
        Thread bearThread = new Thread(bear);
        Thread eagleThread = new Thread(eagle);
        Thread horseThread = new Thread(horse);
        Thread goatThread = new Thread(goat);
        Thread rabbitThread = new Thread(rabbit);
        Thread mouseThread = new Thread(mouse);
        Thread deerThread = new Thread(deer);
        Thread sheepThread = new Thread(sheep);
        Thread wildBoarThread = new Thread(wildBoar);
        Thread duckThread = new Thread(duck);
        Thread caterpillarThread = new Thread(caterpillar);


        boaThread.start();   // Запуск потока с удавом
        foxThread.start();
        bearThread.start();
        rabbitThread.start();
        horseThread.start();
        goatThread.start();
        eagleThread.start();
        mouseThread.start();
        deerThread.start();
        sheepThread.start();
        wildBoarThread.start();
        duckThread.start();
        caterpillarThread.start();
        Wolf.generateWolf(island, width, height);
        WildBoar.generateWildBoar(island, width, height);
        Sheep.generateSheep(island, width, height);


        // Выводим начальное состояние острова
        System.out.println("Начальное состояние острова:");
        island.printIsland();

        // Ждем некоторое время для симуляции
        try {
            Thread.sleep(10000); // Симулируем 10 секунд
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Останавливаем выполнение программы
        System.out.println("Конечное состояние острова:");
        island.printIsland();
    }
    }
