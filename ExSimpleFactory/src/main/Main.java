package main;

import fabrica.Fabrica;
import fabrica.TipTransport;
import mijloaceTransport.Autobuz;
import mijloaceTransport.MijlocTransport;
import mijloaceTransport.Tramvai;

public class Main{
    public static void main(String[] args) {
        Fabrica fabricaBus = new Fabrica();
        MijlocTransport autobuz = (Autobuz) fabricaBus.getMijlocTransport(TipTransport.AUTOBUZ, "Mercedes",105,"Diesel");
        autobuz.afiseazaTipTransport();

        Fabrica fabricaTramvai = new Fabrica();
        MijlocTransport tramvai = fabricaTramvai.getMijlocTransport(TipTransport.TRAMVAI,"Imperio",11);
        tramvai.afiseazaTipTransport();
    }
}