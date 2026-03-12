package simpleFactory.clase.mijloaceTransport;

public class Tramvai implements MijlocTransport{
    private Integer nrLinie;
    private String marca;

    public Tramvai(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvaiul: ").append(nrLinie);
        sb.append(" este produs de: ").append(marca);

        System.out.println(sb.toString());
    }
}
