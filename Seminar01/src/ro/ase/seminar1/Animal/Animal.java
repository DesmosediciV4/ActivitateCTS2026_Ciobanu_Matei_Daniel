package ro.ase.seminar1.Animal;

public abstract class Animal {
    protected String name;
    protected int age;
    public abstract void eat(String mancare);

    public Animal(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


}