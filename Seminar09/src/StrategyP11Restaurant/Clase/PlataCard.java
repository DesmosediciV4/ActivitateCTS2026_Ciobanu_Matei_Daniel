package StrategyP11Restaurant.Clase;

public class PlataCard implements ModalitatePlata{

    @Override
    public void plateste(String numeClient, double sumaDePlata) {
        System.out.println("Clientul: "+numeClient+" are de plata: "+sumaDePlata+" si va plati cu cardul!");
    }
}
