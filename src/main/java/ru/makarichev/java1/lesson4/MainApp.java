package ru.makarichev.java1.lesson4;

import java.util.Random;
import java.util.Scanner;

public class MainApp {
    static char[][] map;

    static final int SIZE = 5;
    static final int DOTS_TO_WIN = 4;

    static final char DOT_PLAYER = 'X';
    static final char DOT_AI = 'O';
    static final char DOT_EMPTY = '*';

    static Scanner sc = new Scanner(System.in);
    static Random random = new Random();

    public static void main(String[] args) {
        prepareMap();
        printMap();
    while (true) {
            playerTurn();
            printMap();
            if (checkWinLines(DOT_PLAYER)) {
                System.out.println("Победил игрок!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }

            aiTurn();
            printMap();
            if (checkWinLines(DOT_AI)) {
                System.out.println("Победил ИИ!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья");
                break;
            }
        }

        System.out.println("Игра завершена");
    }

    //   0 1 2
    // 0 x x x
    // 1 x x x
    // 2 x x x

    //2. Переделать проверку победы, чтобы она не была реализована просто набором условий,
    // например, с использованием циклов.
    //3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5
    // и количества фишек 4. Очень желательно не делать это просто набором условий для каждой
    // из возможных ситуаций;

    public static boolean checkLine(int cx, int cy, int vx, int vy, char dot) {
        if (cx + vx * DOTS_TO_WIN - 1 > SIZE - 1 || cy + vy * DOTS_TO_WIN - 1 > SIZE - 1 ||
                cy + vy * DOTS_TO_WIN + 1 < 0) { // проверяем, что линия не выходит за границы поля
            return false;
        }
        for (int i = 0; i < DOTS_TO_WIN; i++) { // проверяем, может ли ближайшая клетка войти
            //в выигрышную линию
            if (map[cy + i * vy][cx + i * vx] != dot) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkWinLines(char dot) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) { // проверяем все направления в поисках возможных линий
                if (checkLine(i, j, 1, 0, dot) || checkLine(i, j, 0, 1, dot) ||
                        checkLine(i, j, 1, 1, dot) || checkLine(i, j, 1, -1, dot)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void aiTurn() {
        int x, y;
        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellEmpty(x, y));
        map[x][y] = DOT_AI;
        System.out.printf("Ход ИИ: [%d, %d]\n", x + 1, y + 1);
    }

    public static void playerTurn() {
        int x, y;
        do {
            System.out.println("Укажите координаты хода в формате 'x y'");
            x = sc.nextInt() - 1;
            y = sc.nextInt() - 1;
        } while (!isCellEmpty(x, y)); // >>> while (isCellEmpty(x, y) == false)
        map[x][y] = DOT_PLAYER;
    }

    public static boolean isCellEmpty(int x, int y) {
        if (x < 0 || y < 0 || x >= SIZE || y >= SIZE) {
            return false;
        }
        if (map[x][y] == DOT_EMPTY) {
            return true;
        }
        return false;
    }

    public static void printMap() {
        System.out.print("  ");
        for (int i = 1; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int y = 0; y < SIZE; y++) {
            System.out.print((y + 1) + " ");
            for (int x = 0; x < SIZE; x++) {
                System.out.print(map[x][y] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void prepareMap() {
        map = new char[SIZE][SIZE];

        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    //4. *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.



}
