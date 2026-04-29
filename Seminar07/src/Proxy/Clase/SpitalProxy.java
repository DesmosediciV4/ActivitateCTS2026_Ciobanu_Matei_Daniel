package Proxy.Clase;

public class SpitalProxy {
    private String nume;

    public void interneazaPacient(PacientProxy pacient){
        System.out.println("Pacientul "+pacient.getNume()+" este internat in spitalul "+this.nume);
    }

    public SpitalProxy(String nume) {
        this.nume = nume;
    }
}
