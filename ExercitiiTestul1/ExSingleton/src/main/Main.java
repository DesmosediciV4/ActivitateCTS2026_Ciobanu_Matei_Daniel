package main;

import Clase.Agentie;

public class Main {
    public static void main(String[] args) {
        Agentie instanta = Agentie.getInstanta("1",100);
        //Agentie instance2 = new Agentie();
        instanta.afisare("prima instanta");
        Agentie instanta2 = Agentie.getInstanta("2",150);
        instanta2.afisare("a doua");
        instanta2.setNumePachet("4");
        instanta2.setPret(205);
        instanta2.afisare("a treia");
    }
}