package Prototype.Main;

import Prototype.Clase.Rezervare;

public class main {
    public static void main(String[] args) {
        Rezervare rezervare = new Rezervare(16, "Gigel Frone", 3, "1234 4567 4191 9481");
        Rezervare rezervare1 = (Rezervare) rezervare.copiaza();
        rezervare1.setOra(18);
        rezervare.toString();
        rezervare1.toString();
    }
}
