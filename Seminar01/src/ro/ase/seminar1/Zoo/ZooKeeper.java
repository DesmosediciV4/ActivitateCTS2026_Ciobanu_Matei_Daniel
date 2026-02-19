package ro.ase.seminar1.Zoo;

import ro.ase.seminar1.Animal.Animal;

public class ZooKeeper {
    private String name;
    public void feedAnimal(Animal animal) {
        System.out.println("ZooKeeper-ul "+name+" a hranit "+animal.toString());
        animal.eat("mancare");
    }

    public ZooKeeper(String name) {
        this.name = name;
    }


}