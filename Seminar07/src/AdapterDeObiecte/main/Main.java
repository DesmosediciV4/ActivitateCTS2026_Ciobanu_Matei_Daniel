package AdapterDeObiecte.main;

import AdapterDeObiecte.AplicatieFarmacie.AdapterMedicamentSpital;
import AdapterDeObiecte.AplicatieFarmacie.MedicamentFarmacie;
import AdapterDeObiecte.AplicatieSpital.MedicamentSpital;

public class Main {
    public static void realizeazaAchizitie(MedicamentFarmacie medicamentFarmacie){
        medicamentFarmacie.cumparaMedicament();
    }

//        realizeazaAchizitie(nurofen);  Astea se pun in main
//        realizeazaAchizitie(paracetamol); Paracetamol nu merge si trb sa faci 2 functii, problema aceasta o rezolva adapterul.


    public static void main(String[] args) {
        MedicamentSpital paracetamol = new MedicamentSpital();
        MedicamentFarmacie nurofen = new MedicamentFarmacie();
        paracetamol.achizitioneazaMedicament();
        nurofen.cumparaMedicament();

        AdapterMedicamentSpital paracetamolAdaptat = new AdapterMedicamentSpital(paracetamol);
        realizeazaAchizitie(nurofen);
        realizeazaAchizitie(paracetamolAdaptat);
    }
}