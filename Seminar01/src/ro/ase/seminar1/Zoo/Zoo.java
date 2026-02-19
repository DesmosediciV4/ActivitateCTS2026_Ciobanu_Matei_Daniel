package ro.ase.seminar1.Zoo;

import ro.ase.seminar1.Animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    ZooKeeper zooKeeper;
    List<Animal> animale;
    public void feedAllAnimals(){
        for(Animal animal:animale){
            zooKeeper.feedAnimal(animal);
        }
    }

    public Zoo(ZooKeeper zooKeeper, String name) {
        this.zooKeeper = zooKeeper;
        this.name = name;
        this.animale = new ArrayList<>();
    }

    public void adaugaAnimal(Animal animal){
        animale.add(animal);
    }
}
