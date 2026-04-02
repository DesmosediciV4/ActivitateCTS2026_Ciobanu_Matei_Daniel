package mijloaceTransport;

public class Tramvai implements MijlocTransport {
    private String producator;
    private int nrLinie;

    public Tramvai(String producator, int nrLinie) {
        this.producator = producator;
        this.nrLinie = nrLinie;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Tramvaiul: ").append(nrLinie);
        sb.append(" este produs de: ").append(producator);
        System.out.println(sb.toString());
    }
}
