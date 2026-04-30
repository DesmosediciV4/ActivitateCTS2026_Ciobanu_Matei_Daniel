package mijloaceTransport;

public class Autobuz implements MijlocTransport{
    private String producator;
    private int nrLinie;
    private String motorizare;
    
    public Autobuz(String producator, int nrLinie, String motorizare) {
        this.producator = producator;
        this.nrLinie = nrLinie;
        this.motorizare = motorizare;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul: ").append(nrLinie);
        sb.append(" produs de: ").append(producator);
        sb.append(" este: ").append(motorizare);
        System.out.println(sb.toString());
    }
}
