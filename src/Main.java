import animals.herbivore.*;
import animals.predator.*;
import place.Island;

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

        Wolf.generateWolf(island, width, height);
        WildBoar.generateWildBoar(island, width, height);
        Sheep.generateSheep(island, width, height);
        Rabbit.generateRabbit(island, width, height);
        Mouse.generateMouser(island, width, height);
        Horse.generateHorse(island, width, height);
        Goat.generateGoat(island, width, height);
        Fox.generateFox(island, width, height);
        Eagle.generateEagle(island, width, height);
        Duck.generateDuck(island, width, height);
        Deer.generateDeer(island, width, height);
        Caterpillar.generateCaterpillar(island, width, height);
        Buffalo.generateBuffalo(island, width, height);
        Boa.generateBoa(island, width, height);
        Bear.generateBear(island, width, height);


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
