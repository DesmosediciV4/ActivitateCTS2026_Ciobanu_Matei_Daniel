package Facade.SpitalFacade;

import Facade.Clase.Medic;
import Facade.Clase.Pacient;
import Facade.Clase.Salon;

public class SpitalFacade {
    private Medic medic;
    private Salon salon;

    public void interneazaPacient(Pacient pacient){
        if(pacient.getGravitate()>=4){
            if(medic.areBiletDeTrimitere(pacient)){
                int nrPat = salon.suntPaturiLibere();
                if(nrPat!=-1){
                    System.out.println("Pacientul "+pacient.getNume()+" a fost internat in patul "+nrPat);
                    salon.ocupaPat(nrPat);
                }else{
                    System.out.println("Nu sunt paturi libere!");
                }
            }else{
                System.out.println("Pacientul "+pacient.getNume()+" nu are bilet de internare!");
            }
        }else{
            System.out.println("Pacientul nu este atat de grav bolnav!");
        }
    }

    public SpitalFacade(Medic medic, Salon salon) {
        this.medic = medic;
        this.salon = salon;
    }
}
