package Facade.Main;

import Facade.Clase.Medic;
import Facade.Clase.Pacient;
import Facade.Clase.Salon;
import Facade.SpitalFacade.SpitalFacade;

public class Main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Gigel",8);
        Pacient pacient1 = new Pacient("Mirel",2);
        Pacient pacient2 = new Pacient("Vasile",9);
        Pacient pacient3 = new Pacient("Viorel",5);
        Pacient pacient4 = new Pacient("Marcel",3);
        Medic medic = new Medic("Marin");
        Salon salon = Salon.getInstance();

        if(pacient.getGravitate()>=4){
            if(medic.areBiletDeTrimitere(pacient)){
                int nrPat = salon.suntPaturiLibere();
                if(nrPat!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" a fost internat in patul "+nrPat);
                    salon.ocupaPat(nrPat);
                }
            }
        }
        SpitalFacade facade = new SpitalFacade(new Medic("Burca"), Salon.getInstance());
        facade.interneazaPacient(pacient1);
        facade.interneazaPacient(pacient2);
        facade.interneazaPacient(pacient3);
        facade.interneazaPacient(pacient4);
    }
}
