package StrategyP11Restaurant.Main;

import StrategyP11Restaurant.Clase.Client;
import StrategyP11Restaurant.Clase.PlataCash;

public class Main {
    public static void main(String[] args) {
        Client client = new Client("Mirel");
        client.platesteTranzactie(250);

        client.setModalitatePlata(new PlataCash());
        client.platesteTranzactie(245);
    }
}
