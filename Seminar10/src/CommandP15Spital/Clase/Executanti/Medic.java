package CommandP15Spital.Clase.Executanti;

public class Medic implements Personal{
    private String nume;

    public Medic(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Medicul "+nume+" interneaza pacientul: "+pacient.getNume());
    }
}
