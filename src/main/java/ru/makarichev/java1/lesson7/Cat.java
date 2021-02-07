package ru.makarichev.java1.lesson7;

public class Cat {
    private String name;
    private boolean notHungry;

    public Cat(String name) {
        this.name = name;
    }

    public void eat(Plate plate) {
        if(plate.decreaseFood(30)){
            System.out.println(name + " покушал");
            notHungry = true;
        } else  {
            System.out.println(name + " не хватило еды");
        }
    }

    public void info(){
        System.out.println(name + " не голоден " + notHungry);
    }
}
