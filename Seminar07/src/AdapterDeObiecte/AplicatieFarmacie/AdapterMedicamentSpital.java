package AdapterDeObiecte.AplicatieFarmacie;

import AdapterDeObiecte.AplicatieSpital.MedicamentSpital;

// Adapter de obiecte
public class AdapterMedicamentSpital extends MedicamentFarmacie {
    MedicamentSpital medicamentSpital;

    public AdapterMedicamentSpital(MedicamentSpital medicamentSpital) {
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament() {
        medicamentSpital.achizitioneazaMedicament();
    }
}
