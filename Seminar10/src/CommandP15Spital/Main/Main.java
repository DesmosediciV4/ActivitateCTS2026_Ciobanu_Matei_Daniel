package CommandP15Spital.Main;

import CommandP15Spital.Clase.Comenzi.ICommand;
import CommandP15Spital.Clase.Comenzi.Internare;
import CommandP15Spital.Clase.Comenzi.Tratare;
import CommandP15Spital.Clase.Executanti.Asistenta;
import CommandP15Spital.Clase.Executanti.Medic;
import CommandP15Spital.Clase.Executanti.Pacient;
import CommandP15Spital.Clase.Executanti.Personal;
import CommandP15Spital.Clase.Executanti.Operator;

public class Main {
    public static void main(String[] args) {
        Personal medic = new Medic("Stefan");
        Personal asistenta= new Asistenta("Maricica");
        Pacient pacient = new Pacient("Bogdan");
        Pacient pacient1 = new Pacient("Ionut");

        ICommand comanda = new Internare(medic,pacient);
        ICommand comanda1 = new Internare(asistenta,pacient1);

        Operator operator = new Operator();
        operator.inregistreaza(comanda);
        operator.inregistreaza(comanda1);
        operator.executaFisa();

        operator.inregistreaza(new Tratare(asistenta,new Pacient("Marian")));
        operator.executaFisa();
        operator.executaFisa();

    }
}
