package ru.makarichev.java1.lesson1;

//1. Создать пустой проект в IntelliJ IDEA и прописать метод main();
public class Main {

    public static void main(String[] args) {
        //2. Создать переменные всех пройденных типов данных, и инициализировать их значения;
        byte var_byte = -120;
        short var_short = 20053;
        int var_int = -200000000;
        long var_long = 100000000L;
        float var_float = 0.234f;
        double var_double = 0.552;
        char var_char = 'e';
        boolean var_bool = true;
        String string = "строка";

        System.out.println("var_byte = " + var_byte);
        System.out.println("var_short = " + var_short);
        System.out.println("var_int = " + var_int);
        System.out.println("var_long = " + var_long);
        System.out.println("var_float = " + var_float);
        System.out.println("var_double = " + var_double);
        System.out.println("var_char = " + var_char);
        System.out.println("var_bool = " + var_bool);
        System.out.println("var_str = " + string);
        System.out.println();
        //3. Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
        // где a, b, c, d – входные параметры этого метода;
        System.out.println("Результат выражения: " + calcExpression(10.0f, 20.0f, 8.0f, 2.0f));
        System.out.println();

        //4. Написать метод, принимающий на вход два числа, и проверяющий что их сумма
        // лежит в пределах от 10 до 20(включительно), если да – вернуть true,
        // в противном случае – false;
        System.out.println("Сумма чисел 13 и 2 лежит в диапазоне от 10 до 20: " +
                checkSumRange(13, 2));
        System.out.println();

        //5. Написать метод, которому в качестве параметра передается целое число,
        // метод должен напечатать в консоль положительное ли число передали, или отрицательное;
        // Замечание: ноль считаем положительным числом.
        checkInteger(-2);
        System.out.println();

        //6. Написать метод, которому в качестве параметра передается целое число,
        // метод должен вернуть true, если число отрицательное;
        System.out.println(checkIntegerBool(-1));
        System.out.println();

        //7. Написать метод, которому в качестве параметра передается строка, обозначающая имя,
        // метод должен вывести в консоль сообщение «Привет, указанное_имя!»;
        System.out.println("Привет, " + greetName("Вася") + "!");
        System.out.println();

        //8. * Написать метод, который определяет является ли год високосным,
        // и выводит сообщение в консоль. Каждый 4-й год является високосным,
        // кроме каждого 100-го, при этом каждый 400-й – високосный.
        System.out.println("Високосный ли год 2100: " + isLeapYear(2100));
    }

    private static float calcExpression(float a, float b, float c, float d) {
        return a * (b + (c / d));
    }

    private static void checkInteger(int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else
            System.out.println("Число положительное");
    }

    private static boolean checkIntegerBool(int number) {
        return number <= 0;
    }

    private static String greetName(String name) {
        return name;
    }

    private static boolean checkSumRange(int a, int b) {
        int sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }
}
