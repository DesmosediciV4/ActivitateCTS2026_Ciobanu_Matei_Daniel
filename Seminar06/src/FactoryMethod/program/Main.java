package FactoryMethod.program;

import FactoryMethod.Clase.FelDeMancare;
import FactoryMethod.Fabrica.*;

public class Main {
    public static void main(String[] args) {
        FelDeMancareFabrica fabrica = new SupaFabrica();
        FelDeMancare supaCrema = fabrica.getFelDeMancare(TipSupa.SUPA_CREMA,500," de morcovi");
        FelDeMancare ciorba = fabrica.getFelDeMancare(TipSupa.CIORBA,400," de legume"); //Aici daca puneai Supa in loc de FelDeMancare da eroare pt ca el mostenste FelDeMancare si tu trebuie sa pui nivelul cel mai de sus

        FelDeMancareFabrica fabricaDesert = new DesertFabrica();
        FelDeMancare papanasi = fabricaDesert.getFelDeMancare(TipDesert.PAPANASI, 250, " cu dulceata de afine", 750);
        FelDeMancare clatite = fabricaDesert.getFelDeMancare(TipDesert.CLATITE, 175, " cu nutella si banane", 650);

        supaCrema.afiseazaPret();
        ciorba.afiseazaPret();
        papanasi.afiseazaPret();
        clatite.afiseazaPret(); //AbstractFactory nu intra la test, dar asta da(FactoryMethod)!
    }
}