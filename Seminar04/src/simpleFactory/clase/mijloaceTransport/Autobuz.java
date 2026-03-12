package simpleFactory.clase.mijloaceTransport;

import javax.xml.transform.Source;

public class Autobuz implements MijlocTransport {
    private Integer nrLinie;
    private String marca;

    public Autobuz(Integer nrLinie, String marca) {
        this.nrLinie = nrLinie;
        this.marca = marca;
    }

    @Override
    public void afiseazaTipTransport() {
        StringBuilder sb = new StringBuilder();
        sb.append("Autobuzul: ").append(nrLinie);
        sb.append(" este produs de: ").append(marca);

        System.out.println(sb.toString());
    }
}
