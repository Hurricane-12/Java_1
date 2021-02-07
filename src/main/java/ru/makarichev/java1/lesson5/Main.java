package ru.makarichev.java1.lesson5;

public class Main {

    //4. Создать массив из 5 сотрудников.
    //Пример:
    //Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
    //persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
    //persArray[1] = new Person(...);
    //...
    //persArray[4] = new Person(...);
    public static void main(String[] args) {
        Employee[] employee = {
                new Employee("Иван", "менеджер1", "1@mail.ru", "1234567", 25),
                new Employee("Петр", "менеджер2", "2@mail.ru", "7654321", 42),
                new Employee("Николай", "менеджер3", "3@mail.ru", "5682761", 57),
                new Employee("Денис", "менеджер4", "4@mail.ru", "1059591", 36),
                new Employee("Станислав", "менеджер5", "5@mail.ru", "2177712", 41),
        };
        //5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getAge() >= 40) {
                employee[i].employeeInfo();
            }
        }
    }
}
