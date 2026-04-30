package Clase;

public class Hotel extends Cazare {

    public Hotel(String descriere, String adresa) {
        super(descriere, adresa);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hotelul: ").append(super.descriere);
        sb.append(" are adresa ").append(super.adresa);
        System.out.println(sb.toString());
    }
}
