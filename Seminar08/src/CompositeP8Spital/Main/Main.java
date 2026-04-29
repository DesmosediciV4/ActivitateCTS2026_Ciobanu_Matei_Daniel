package CompositeP8Spital.Main;

import CompositeP8Spital.Clase.Departament;
import CompositeP8Spital.Clase.Sectie;
import CompositeP8Spital.Clase.Structura;

public class Main {
    public static void main(String[] args) {

        Structura depSpital = new Departament("Spital");
        Structura depAdministrativ = new Departament("Administrativ");
        Structura sectieSecretariat = new Sectie("Secretariat",112);
        Structura sectieManagement = new Sectie("Management",24);

        ((Departament)depSpital).adaugaStructura(depAdministrativ);
        ((Departament)depSpital).adaugaStructura(sectieManagement);
        ((Departament)depAdministrativ).adaugaStructura(sectieSecretariat);

        depSpital.afiseazaDetaliiStructura("");

        //Vrem ca sectia management sa nu mai depinda de spital si sa apartina de administrativ
        ((Departament)depSpital).stergeStructura(sectieManagement);
        ((Departament)depAdministrativ).adaugaStructura(sectieManagement);
        System.out.println("Dupa modificare: \n");
        depSpital.afiseazaDetaliiStructura("");
    }
}
