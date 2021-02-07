package ru.makarichev.java1.lesson7;

public class Plate {
    private int food;

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        }
        return false;
    }

    public void addFood(int amount) {
        food += amount;
    }

    public Plate(int food) {
        this.food = food;
    }

    public void info() {
        System.out.println("Еды осталось: " + food);
    }
}
