package CommandP15Spital.Clase.Comenzi;

import CommandP15Spital.Clase.Executanti.Pacient;
import CommandP15Spital.Clase.Executanti.Personal;

public class Internare implements ICommand{
    private Personal medic;
    private Pacient pacient;

    public Internare(Personal medic, Pacient pacient) {
        this.medic = medic;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        medic.preluarePacient(pacient);
    }
}
