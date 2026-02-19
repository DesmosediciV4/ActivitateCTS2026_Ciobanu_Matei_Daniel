package ro.ase.seminar1;

import ro.ase.seminar1.Animal.Lion;
import ro.ase.seminar1.Animal.Tigru;
import ro.ase.seminar1.Animal.Zebra;
import ro.ase.seminar1.Zoo.Zoo;
import ro.ase.seminar1.Zoo.ZooKeeper;

public class Main {
    public static void main(String[] args) {
        ZooKeeper zooKeeper = new ZooKeeper("Viorel");
        Lion firstLion = new Lion(2,"Mufasa",140);
        Zebra firstZebra = new Zebra(3,"Martynel", 125);
        Zoo gradinaZoo = new Zoo(zooKeeper, "GradinaZooBucuresti");

        gradinaZoo.adaugaAnimal(firstLion);
        gradinaZoo.adaugaAnimal(firstZebra);
        gradinaZoo.adaugaAnimal(new Tigru(1,"Tigru", "Bengalez"));

        gradinaZoo.feedAllAnimals();
    }
}