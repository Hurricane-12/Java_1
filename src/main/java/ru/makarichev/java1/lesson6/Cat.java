package ru.makarichev.java1.lesson6;

public class Cat extends Animal {
    public Cat(String type, String name, int runLimit) {
        super(type, name, runLimit);
    }

    @Override
    public void swim(int swimDistance) {
        System.out.println(type + " " + name + " не умеет плавать");
    }
}
