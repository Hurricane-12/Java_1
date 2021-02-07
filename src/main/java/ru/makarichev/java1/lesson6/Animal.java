package ru.makarichev.java1.lesson6;

    //1. Создать классы Собака и Кот с наследованием от класса Животное.
public abstract class Animal {
    protected String type;
    protected String name;

    int runLimit;
    int swimLimit;
    protected static int totalAnimals;

    public Animal(String type, String name, int runLimit) {
        this.type = type;
        this.name = name;
        this.runLimit = runLimit;
        totalAnimals++;
    }

    public void run(int runDistance) {
        if(runDistance < runLimit) {
            System.out.println(type + " " + name + " пробежал");
        } else {
            System.out.println(type + " " + name + " не пробежал");
        }
    }

    public void swim(int swimDistance) {
        if(swimDistance < swimLimit) {
            System.out.println(type + " " + name + " проплыл");
        } else {
            System.out.println(type + " " + name + " не проплыл");
        }
    }
}
