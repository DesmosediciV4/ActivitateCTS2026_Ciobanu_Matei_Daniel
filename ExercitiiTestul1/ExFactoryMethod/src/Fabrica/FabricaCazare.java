package Fabrica;

import Clase.Hotel;
import Clase.Motel;
import Clase.PachetTuristic;

public class FabricaCazare implements PachetFabrica{
    @Override
    public PachetTuristic getPachetTuristic(TipPachet tip, String denumire, String adresa) {
        switch (tip){
            case TipCazare.HOTEL -> {
                return new Hotel(denumire,adresa);
            }
            case TipCazare.MOTEL -> {
                return new Motel(denumire,adresa);
            }
            default -> {
                return null;
            }
        }
    }

    @Override
    public PachetTuristic getPachetTuristic(TipPachet tip, String denumire, int cost) {
        return this.getPachetTuristic(tip,denumire,0);
    }
}
