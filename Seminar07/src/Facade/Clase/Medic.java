package Facade.Clase;

public class Medic {
    public String nume;
    public boolean areBiletDeTrimitere(Pacient pacient){
//        if(pacient.getGravitate()>=6) {
//            return true;
//        }
//        return false; poti face asa sau mai simplu:
        return pacient.getGravitate()>=6;
    }

    public Medic(String nume) {
        this.nume = nume;
    }
}
