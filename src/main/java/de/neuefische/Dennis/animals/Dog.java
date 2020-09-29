package de.neuefische.Dennis.animals;

public class Dog implements Animal {

    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void makeNoise() {
        System.out.println(name+" macht WauWauWau");

    }
}
