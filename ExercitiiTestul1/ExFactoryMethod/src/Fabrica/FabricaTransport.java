package Fabrica;

import Clase.Autobuz;
import Clase.Microbuz;
import Clase.PachetTuristic;

public class FabricaTransport implements PachetFabrica {


    @Override
    public PachetTuristic getPachetTuristic(TipPachet tip, String denumire, String adresa) {
        return this.getPachetTuristic(tip,denumire,"default");
    }

    @Override
    public PachetTuristic getPachetTuristic(TipPachet tip, String denumire, int cost) {
        switch (tip) {
            case TipTransport.AUTOBUZ:
                return new Autobuz(denumire,cost);

            case TipTransport.MICROBUZ:
                return new Microbuz(denumire,cost);

            default:
                return null;
        }
    }
}
