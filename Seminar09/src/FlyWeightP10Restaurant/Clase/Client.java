package FlyWeightP10Restaurant.Clase;

public class Client implements ClientAbstract{
    private String nume;
    private String nrTel;
    private String email;

    public Client(String nume, String nrTel, String email) {
        this.nume = nume;
        this.nrTel = nrTel;
        this.email = email;
    }

    @Override
    public void afiseazaRezervare(Rezervare rezervare) {
        StringBuilder sb = new StringBuilder();
        sb.append("Clinetul ");
        sb.append(nume);
        sb.append(" cu numarul de telefon ");
        sb.append(nrTel);
        sb.append(" si emailul ");
        sb.append(email);
        sb.append(rezervare.toString());
        System.out.println(sb);
    }

    @Override
    public void plateste(Rezervare rezervare,double taxaPerPersoana) {
        System.out.println("Clientul "+nume+" trebuie sa plateasca "+rezervare.getNrPersoane()*taxaPerPersoana+" RON.");
    }
}
