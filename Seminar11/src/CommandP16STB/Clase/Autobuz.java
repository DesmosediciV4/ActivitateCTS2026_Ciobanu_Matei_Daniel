package CommandP16STB.Clase;

public class Autobuz {
    private String producator;
    private String nrInmatriculare;

    public Autobuz(String producator, String nrInmatriculare) {
        this.producator = producator;
        this.nrInmatriculare = nrInmatriculare;
    }

    public void pornestePeTraseu(int nrLinie){
        System.out.println("Autobuzul "+producator+" merge pe traseul "+nrLinie);
    }
}
