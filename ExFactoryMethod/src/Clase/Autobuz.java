package Clase;

public class Autobuz extends Transport{
    public Autobuz(String descriere, int cost) {
        super(descriere, cost);
    }

    @Override
    public void afiseazaDescriere() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul ").append(super.descriere);
        sb.append(" are costul ").append(super.cost);
        System.out.println(sb.toString());
    }
}
