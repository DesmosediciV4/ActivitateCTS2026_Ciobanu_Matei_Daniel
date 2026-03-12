package simpleFactory.clase.mijloaceTransport;

public class Troleibuz implements MijlocTransport{
    private Integer nrLinie;
    private String marca;

    public Troleibuz(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Troleibuzul: ").append(nrLinie);
        sb.append(" este produs de: ").append(marca);

        System.out.println(sb.toString());
    }
}
