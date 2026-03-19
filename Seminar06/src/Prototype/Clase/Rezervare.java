package Prototype.Clase;

public class Rezervare implements IRezervare{
    private String numeClient;
    private int ora;
    private int nrPers;
    private String nrCard;

    public Rezervare(int ora, String numeClient, int nrPers, String nrCard) {
        if(ora>=11&&ora<=22){
            this.ora = ora;
        }
        else{
            this.ora = 11;
        }

        this.numeClient = numeClient;
        this.nrPers = nrPers;

        if(nrCard.length()==19){
            this.nrCard = nrCard;
        }
        else{
            this.nrCard ="0000 0000 0000 0000";
        }
    }

    private Rezervare() {

    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setOra(int ora) {
        this.ora = ora;
    }

    public void setNrPers(int nrPers) {
        this.nrPers = nrPers;
    }

    public void setNrCard(String nrCard) {
        this.nrCard = nrCard;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", ora=").append(ora);
        sb.append(", nrPers=").append(nrPers);
        sb.append(", nrCard='").append(nrCard).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public IRezervare copiaza() {
        Rezervare rezervare = new Rezervare();
        rezervare.ora= this.ora;
        rezervare.numeClient = this.numeClient;
        rezervare.nrPers = this.nrPers;
        rezervare.nrCard = this.nrCard;
        return rezervare;
    }
}
