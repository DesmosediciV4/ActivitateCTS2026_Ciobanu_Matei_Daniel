package Clase;

public class ListaOferte implements IListaOferte{

    protected String numeOferta;
    protected int pret;
    protected String nrContact;

    public ListaOferte(String numeOferta, int pret, String nrContact) {
        this.numeOferta = numeOferta;
        this.pret = pret;
        this.nrContact = nrContact;
    }

    private ListaOferte(){

    }

    public void setNumeOferta(String numeOferta) {
        this.numeOferta = numeOferta;
    }

    public void setPret(int pret) {
        this.pret = pret;
    }

    public void setNrContact(String nrContact) {
        this.nrContact = nrContact;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ListaOferte{");
        sb.append("numeOferta='").append(numeOferta).append('\'');
        sb.append(", pret=").append(pret);
        sb.append(", nrContact=").append(nrContact);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public ListaOferte copiaza() {
        ListaOferte listaOferte = new ListaOferte();
        listaOferte.numeOferta = this.numeOferta;
        listaOferte.pret = this.pret;
        listaOferte.nrContact = this.nrContact;
        return listaOferte;
    }
}
