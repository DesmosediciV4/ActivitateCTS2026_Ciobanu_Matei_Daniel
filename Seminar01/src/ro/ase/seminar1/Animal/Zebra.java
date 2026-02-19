package ro.ase.seminar1.Animal;

public class Zebra extends Animal {

    private int nrDungi;

    public Zebra(int age, String name, int nrDungi) {
        super(age, name);
        this.nrDungi = nrDungi;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Zebra a mancat " + mancare);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Zebra: ");
        buffer.append(super.toString());
        buffer.append("Numarul dungilor = ");
        buffer.append(this.nrDungi);
        return buffer.toString();
    }
}