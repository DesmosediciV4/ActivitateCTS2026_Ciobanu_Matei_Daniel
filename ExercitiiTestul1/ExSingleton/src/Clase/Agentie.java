package Clase;

public class Agentie {
    protected int cod;
    protected String numePachet;
    protected int pret;
    private static Agentie instanta = null;

    private Agentie(String numePachet, int pret) {
        this.cod = 0;
        this.numePachet = numePachet;
        this.pret = pret;
    }

    public void setNumePachet(String numePachet) {
        this.numePachet = numePachet;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public static synchronized Agentie getInstanta(String numePachet, int pret) {
        if(instanta==null){
            instanta = new Agentie(numePachet,pret);
        }
        return instanta;
    }

    public void afisare(String text){
        StringBuilder sb = new StringBuilder();
        sb.append("Numele pachetului este: ").append(numePachet);
        sb.append(" are pretul ").append(pret);
        sb.append(" text: ").append(text);
        System.out.println(sb.toString());
        this.cod++;
    }
}
