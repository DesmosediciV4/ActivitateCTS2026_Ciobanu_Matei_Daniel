package FlyWeightP10Restaurant.Main;

import FlyWeightP10Restaurant.Clase.Client;
import FlyWeightP10Restaurant.Clase.ClientAbstract;
import FlyWeightP10Restaurant.Clase.RegistruClienti;
import FlyWeightP10Restaurant.Clase.Rezervare;

public class Main {
    public static void main(String[] args) {
        RegistruClienti registru = new RegistruClienti();
        ClientAbstract client = registru.getClient("Gigi","079309832","gigi.becali@gmail.com");
        ClientAbstract client2 = registru.getClient("Boris","0723512091","boris.anatoly@yahoo.com");
        ClientAbstract client3 = registru.getClient("Marian","072321091","marian12@hotmail.com");

        Rezervare rezervare = new Rezervare(12,4,"18:10");
        Rezervare rezervare2 = new Rezervare(5,6,"19:15");
        Rezervare rezervare3 = new Rezervare(9,1,"20:20");

        client.afiseazaRezervare(rezervare);
        client2.afiseazaRezervare(rezervare2);
        client3.afiseazaRezervare(rezervare3);

        registru.getClient("Andrei","0723512091","boris.anatoly@yahoo.com").afiseazaRezervare(rezervare2);
        registru.getClient("Andrei","0723512091","boris.anatoly@yahoo.com").plateste(rezervare2,100);

        Rezervare rezervare4 = new Rezervare(6,2,"21:00");
        registru.getClient("Gigi","079309832","gigi.becali@gmail.com").afiseazaRezervare(rezervare4);
        registru.getClient("Gigi","079309832","gigi.becali@gmail.com").plateste(rezervare4,150);
    }
}