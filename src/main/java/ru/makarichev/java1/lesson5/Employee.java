package ru.makarichev.java1.lesson5;

    //1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
public class Employee {
    private String name;
    private String position;
    private String email;
    private String phone;
    private int age;

    public int getAge() {
        return age;
    }

    //2. Конструктор класса должен заполнять эти поля при создании объекта.
    public Employee(String name, String position, String email, String phone, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.age = age;
    }

    //3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.
    public void employeeInfo(){
        System.out.println(name + " " + position + " " + email + " " + phone + " " + age);
    }
}
