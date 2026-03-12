package simpleFactory.clase.Factory;

import simpleFactory.clase.mijloaceTransport.*;

public class Factory {
    public MijlocTransport getMijlocTransport(TipTransport tip, Integer nrLinie, String marca){
        switch (tip){
            case TipTransport.AUTOBUZ -> {
                return new Autobuz(nrLinie, marca);
            }
            case TipTransport.TRAMVAI -> {
                return new Tramvai(nrLinie, marca);
            }
            case TipTransport.TROLEIBUZ -> {
                return new Troleibuz(nrLinie, marca);
            }
            default -> {
                return null;
            }
        }
    }

}
