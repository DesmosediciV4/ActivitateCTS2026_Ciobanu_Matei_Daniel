package CommandP15Spital.Clase.Executanti;

public class Asistenta implements Personal{
    private String nume;

    public Asistenta(String nume) {
        this.nume = nume;
    }

    @Override
    public void preluarePacient(Pacient pacient) {
        System.out.println("Asistenta "+nume+" trateaza imediat pacientul "+pacient.getNume());
    }
}
