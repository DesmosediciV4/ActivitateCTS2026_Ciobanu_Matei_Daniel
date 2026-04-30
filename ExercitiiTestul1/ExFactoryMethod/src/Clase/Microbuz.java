package Clase;

public class Microbuz extends Transport{

    public Microbuz(String descriere, int cost) {
        super(descriere, cost);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Microbuzul ").append(super.descriere);
        sb.append(" are costul ").append(super.cost);
        System.out.println(sb.toString());
    }
}
