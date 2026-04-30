package FlyWeightP10Restaurant.Clase;

public class Rezervare {
    private int nrMasa;
    private int nrPersoane;
    private String oraRezervarii;

    public Rezervare(int nrMasa, int nrPersoane, String oraRezervarii) {
        this.nrMasa = nrMasa;
        this.nrPersoane = nrPersoane;
        this.oraRezervarii = oraRezervarii;
    }

    public int getNrPersoane() {
        return nrPersoane;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervarea: ");
        sb.append("are numarul mesei=").append(nrMasa);
        sb.append(", cu numarul de persoane=").append(nrPersoane);
        sb.append(", iar ora rezervarii este:'").append(oraRezervarii).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
