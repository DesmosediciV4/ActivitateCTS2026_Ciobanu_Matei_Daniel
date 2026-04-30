package Main;

import Clase.ListaOferte;

public class Main {
    public static void main(String[] args) {
        ListaOferte listaOferte = new ListaOferte("Zanzibar",1250,"0766959521");
        ListaOferte listaOferte1 = (ListaOferte) listaOferte.copiaza();
        System.out.println(listaOferte);
        System.out.println(listaOferte1);
        listaOferte1.setPret(2500);
        System.out.println(listaOferte1);

    }
}