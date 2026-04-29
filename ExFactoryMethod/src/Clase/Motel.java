package Clase;

public class Motel extends Cazare{
    public Motel(String descriere, String adresa) {
        super(descriere, adresa);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Motelul: ").append(super.descriere);
        sb.append(" are adresa ").append(super.adresa);
        System.out.println(sb.toString());
    }
}
