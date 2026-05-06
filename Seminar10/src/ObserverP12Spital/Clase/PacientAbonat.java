package ObserverP12Spital.Clase;

public class PacientAbonat implements IPacient {
    private String nume;
    private int varsta;

    public PacientAbonat(String nume, int varsta) {
        this.nume = nume;
        this.varsta = varsta;
    }

    @Override
    public void receptioneazaNotificare(String mesaj) {
        System.out.println("Pacientul "+nume+" a primit mesajul: "+mesaj);
    }
}
