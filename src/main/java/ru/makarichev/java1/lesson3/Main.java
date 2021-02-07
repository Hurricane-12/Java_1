package ru.makarichev.java1.lesson3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Random random = new Random();

    public static void main(String[] args) {
//        guessNumber();
        guessWord();
    }

    //1. Написать программу, которая загадывает случайное число от 0 до 9
    // и пользователю дается 3 попытки угадать это число. При каждой попытке
    // компьютер должен сообщить, больше ли указанное пользователем число,
    // чем загаданное, или меньше. После победы или проигрыша выводится запрос –
    // «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).

    private static void guessNumber() {
        while (true) {
            int computerNumber = random.nextInt(10);
            for (int i = 0; i < 3; i++) {  // три попытки
                System.out.println("Угадайте число от 0 до 9");
                int userAnswer = scanner.nextInt();
                if (userAnswer == computerNumber) {
                    System.out.println("Вы угадали");
                    break;
                } else if (userAnswer > computerNumber) {
                    System.out.println("Число меньше");
                } else if (userAnswer < computerNumber) {
                    System.out.println("Число больше");
                }
            }
            System.out.println("Для завершения игры введите 0, " +
                    "для продолжения игры - любую другую цифру");
            int userAnotherRound = scanner.nextInt();
            if (userAnotherRound == 0) {
                break;
            }
        }
    }

    //* Создать массив из слов
    //String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
    // "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
    // "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
    // "pineapple", "pumpkin", "potato"}.
    //При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя,
    // сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь.
    // Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
    //apple – загаданное
    //apricot - ответ игрока
    //ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
    //Для сравнения двух слов посимвольно можно пользоваться:
    //String str = "apple";
    //char a = str.charAt(0); - метод вернет char, который стоит в слове str на первой позиции
    //Играем до тех пор, пока игрок не отгадает слово.
    //Используем только маленькие буквы.

    private static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado",
        "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi",
        "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
        "pineapple", "pumpkin", "potato"};
        String computerWord = words[random.nextInt(words.length)];

        while (true){
            System.out.println("Угадайте слово");
            String userAnswer = scanner.next();
            if (userAnswer.equals(computerWord)){
                System.out.println("Вы угадали");
                break;
            } else {
                for (int i = 0; i < 9; i++) {  // в самом длинном слове 9 букв
                    if (i < userAnswer.length() && i < computerWord.length() &&
                            userAnswer.charAt(i) == computerWord.charAt(i)) {
                        System.out.print(userAnswer.charAt(i));
                    } else {
                        System.out.print('#');
                    }

                }
                System.out.println();
            }
        }


    }
}
