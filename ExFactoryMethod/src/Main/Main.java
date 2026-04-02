package Main;

import Clase.PachetTuristic;
import Fabrica.*;

public class Main {
    public static void main(String[] args) {
        PachetFabrica fabricaCazare = new FabricaCazare();
        PachetFabrica fabricaTransport = new FabricaTransport();

        PachetTuristic hotel = fabricaCazare.getPachetTuristic(TipCazare.HOTEL,"New Montana 4*","Intrarea Panselutelor, Sinaia");
        PachetTuristic motel = fabricaCazare.getPachetTuristic(TipCazare.MOTEL,"Cheap Motel","Route66, IL,USA");

        PachetTuristic autobuz = fabricaTransport.getPachetTuristic(TipTransport.AUTOBUZ,"MAN",250);
        PachetTuristic microbuz = fabricaTransport.getPachetTuristic(TipTransport.MICROBUZ,"Mercedes",150);

        hotel.afiseazaDescriere();
        motel.afiseazaDescriere();
        autobuz.afiseazaDescriere();
        microbuz.afiseazaDescriere();
    }
}