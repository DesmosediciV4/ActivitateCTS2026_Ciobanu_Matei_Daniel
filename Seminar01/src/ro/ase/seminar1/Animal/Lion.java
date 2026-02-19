package ro.ase.seminar1.Animal;

public class Lion extends Animal{

    private int greutate;

    public Lion(int age, String name, int greutate) {
        super(age, name);
        this.greutate = greutate;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Leul a mancat "+mancare);
    }

    @Override
    public String toString() {
        StringBuilder buffer = new StringBuilder();
        buffer.append("Leul: ");
        buffer.append(super.toString());
        buffer.append("greutate = ");
        buffer.append(this.greutate);
        return buffer.toString();
    }
}