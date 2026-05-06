package CommandP15Spital.Clase.Comenzi;

import CommandP15Spital.Clase.Executanti.Pacient;
import CommandP15Spital.Clase.Executanti.Personal;

public class Tratare implements ICommand{
    private Personal asistenta;
    private Pacient pacient;

    public Tratare(Personal asistenta, Pacient pacient) {
        this.asistenta = asistenta;
        this.pacient = pacient;
    }

    @Override
    public void executa() {
        asistenta.preluarePacient(pacient);
    }
}
