package place;

import java.util.Random;

public class Island {
     Location[][] locations;
    private int width; // ширина
    private int height; // высота
    // Конструктор для создания острова с заданными размерами
    public Island(int width, int height) {
        this.width = width;
        this.height = height;
        locations = new Location[width][height]; // Инициализация массива локаций
        Random random = new Random();
        // Цикл по каждой ячейке массива для создания локаций
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                locations[i][j] = new Location();// Каждая ячейка заполняется объектом place.Location
            }
        }
    }
    // Метод для получения локации по её координатам на острове
    public Location getLocation(int x, int y) {
        if (x >= 0 && x < width && y >= 0 && y < height) {
            return locations[x][y]; // Возвращает локацию, если координаты в пределах острова
        } else {
            return null; // Если координаты за пределами, возвращает null
        }
    }

    // Вывести текущее состояние острова (количество животных и растений в каждой локации)
    public void printIsland() {
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(locations[i][j].toString() + " "); // Печатает информацию о каждой локации
            }
            System.out.println();
        }
    }
}
