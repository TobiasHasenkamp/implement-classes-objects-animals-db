package de.neuefische.Dennis.animals;

public class Cat implements Animal {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {return name; }

    @Override
    public void makeNoise() {
        System.out.println("Miaauuu");
    }

}
