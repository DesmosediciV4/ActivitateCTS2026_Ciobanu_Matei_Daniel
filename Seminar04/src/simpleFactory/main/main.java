package simpleFactory.main;

import simpleFactory.clase.Factory.Factory;
import simpleFactory.clase.Factory.TipTransport;
import simpleFactory.clase.mijloaceTransport.Autobuz;
import simpleFactory.clase.mijloaceTransport.MijlocTransport;
import simpleFactory.clase.mijloaceTransport.Tramvai;

public class main {
    public static void main(String[] args) {
        Factory fabricaTransport = new Factory();
        MijlocTransport autobuz = fabricaTransport.getMijlocTransport(
                TipTransport.AUTOBUZ,102,"Man"
        );
        autobuz.afiseazaTipTransport();
        MijlocTransport tramvai = (Tramvai) fabricaTransport.getMijlocTransport(
                TipTransport.TRAMVAI, 21, "Imperio"
        );
        tramvai.afiseazaTipTransport();
        MijlocTransport troleibuz = fabricaTransport.getMijlocTransport(
                TipTransport.TROLEIBUZ, 89, "Tatra"
        );
        troleibuz.afiseazaTipTransport();
    }
}
