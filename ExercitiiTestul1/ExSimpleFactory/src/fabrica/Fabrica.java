package fabrica;

import mijloaceTransport.Autobuz;
import mijloaceTransport.MijlocTransport;
import mijloaceTransport.Tramvai;

public class Fabrica {
//    public MijlocTransport getMijlocTransport(TipTransport tip, String producator, int nrLinie, String motorizare){
//        switch (tip){
//            case TipTransport.AUTOBUZ -> {
//                return new Autobuz(producator,nrLinie,motorizare);
//            }
//            case TipTransport.TRAMVAI -> {
//                return new Tramvai(producator,nrLinie);
//            }
//            default -> {
//                return null;
//            }
//        }
//    }


    public MijlocTransport getMijlocTransport(TipTransport tip, String producator, int nrLinie, String motorizare) {
        if (tip == TipTransport.AUTOBUZ) {
            return new Autobuz(producator, nrLinie, motorizare);
        }
        return null;
    }

    public MijlocTransport getMijlocTransport(TipTransport tip, String producator, int nrLinie) {
        if (tip == TipTransport.TRAMVAI) {
            return new Tramvai(producator, nrLinie);
        }
        return null;
    }

}
