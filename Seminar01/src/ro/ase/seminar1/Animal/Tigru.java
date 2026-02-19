package ro.ase.seminar1.Animal;

public class Tigru extends Animal{
    private String rasa;

    public Tigru(int age, String name,String rasa) {
        super(age, name);
        this.rasa = rasa;
    }

    @Override
    public void eat(String mancare) {
        System.out.println("Tigrul "+super.name+" a mancat "+mancare);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Tigru{");
        sb.append("rasa='").append(rasa).append('\'');
        sb.append(super.toString());
        sb.append('}');
        return sb.toString();
    }
}
