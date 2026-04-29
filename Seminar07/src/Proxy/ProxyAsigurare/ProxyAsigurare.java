package Proxy.ProxyAsigurare;

import Facade.Clase.Pacient;
import Proxy.Clase.ISpital;
import Proxy.Clase.PacientProxy;

public class ProxyAsigurare implements ISpital {
    private ISpital spital;

    @Override
    public void interneazaPacient(PacientProxy pacientP) {
        if(pacientP.isAreAsigurare()){
            spital.interneazaPacient(pacientP);
        } else{
            System.out.println("Pacientul nu are asigurare");
        }
    }

    public ProxyAsigurare(ISpital spital) {
        this.spital = spital;
    }
}
