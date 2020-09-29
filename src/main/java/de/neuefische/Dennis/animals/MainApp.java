package de.neuefische.Dennis.animals;

public class MainApp {
    public static void main(String[] args) {

    Animal cat1 = new Cat("Gudrun die Katze");
    Animal dog1 = new Dog("Dogtor Schiwago");

        System.out.print(cat1.getName()+" macht ");
        playSound(cat1);
        dog1.makeNoise();

    }

    public static void playSound(Animal animal){
        animal.makeNoise();
    }

}
