package Proxy.Main;

import Proxy.Clase.PacientProxy;
import Proxy.Clase.SpitalProxy;
import Proxy.ProxyAsigurare.ProxyAsigurare;

public class Main {
    public static void main(String[] args) {
        PacientProxy pacient = new PacientProxy("Davies",true);
        SpitalProxy spital = new SpitalProxy("Judetean");

        spital.interneazaPacient(pacient);

        ProxyAsigurare proxy = new ProxyAsigurare(spital);
        proxy.interneazaPacient(pacient);
    }
}


