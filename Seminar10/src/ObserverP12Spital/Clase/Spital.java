package ObserverP12Spital.Clase;

import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital{
    private String nume;
    private List<IPacient> listaPacienti = new ArrayList<>();

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void trimiteMesaj(String mesaj) {
        for(IPacient iPacient:listaPacienti){
            iPacient.receptioneazaNotificare(mesaj+" de la spitalul "+this.nume);
        }
    }

    @Override
    public void abonarePacient(IPacient iPacient) {
        listaPacienti.add(iPacient);
    }

    @Override
    public void dezabonarePacient(IPacient iPacient) {
        listaPacienti.remove(iPacient);
    }

    public void notificaVirus(){
        trimiteMesaj("Exista un virus nou in oras!");
    }

    public void notificaEpidemie(){
        trimiteMesaj("Exista o epidemie in oras!");
    }
}
