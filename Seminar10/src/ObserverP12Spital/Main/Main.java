package ObserverP12Spital.Main;

import ObserverP12Spital.Clase.IPacient;
import ObserverP12Spital.Clase.ISpital;
import ObserverP12Spital.Clase.PacientAbonat;
import ObserverP12Spital.Clase.Spital;

public class Main {
    public static void main(String[] args) {
        IPacient iPacient = new PacientAbonat("Ion",89);
        IPacient iPacient1 = new PacientAbonat("Gigi",65);
        IPacient iPacient2 = new PacientAbonat("Vasi",29);

        ISpital iSpital = new Spital("Bagdazar");
        iSpital.abonarePacient(iPacient);
        iSpital.abonarePacient(iPacient1);
        iSpital.abonarePacient(iPacient2);
        iSpital.dezabonarePacient(iPacient1);

        ((Spital)iSpital).notificaVirus();
        ((Spital)iSpital).notificaEpidemie();
    }
}