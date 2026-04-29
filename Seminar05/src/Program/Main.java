package Program;

import BuilderEager.Internare;
import BuilderEager.InternareBuilder;
import BuilderAlternativ.InternareBuilderAlternativ;

public class Main {
    public static void main(String[] args) {
        Internare internare = new Internare("Gigel",true, false, true, true);
        Internare internare1 = new Internare("Andrei",false,false,false,false);
        InternareBuilder builder = new InternareBuilder("Andrei");
        Internare internare2 = builder.build();
        Internare internare3 = builder.setNume("Gigel").setPat(true).setPapuci(true).setHalat(true).build();
        System.out.println(internare);
        System.out.println(internare1);
        System.out.println(internare2);
        System.out.println(internare3);

        InternareBuilderAlternativ builderAlternativ = new InternareBuilderAlternativ();
        builderAlternativ.setMicDejun(true);
        Internare internare4 = builderAlternativ.build("Mihaita");
        Internare internare5 = builderAlternativ.build("Georgeta");
        System.out.println(internare4);
        System.out.println(internare5);

        //Daca vrei sa nu mai poti folosi setteri la prima varianta cum ai dat la linia 13 setNume faci setteri protected
        //Sau faci private atributele si faci inner class pt InternareBuilder in Internare si nu mai ai nevoie de setteri
        //Asta e a 3 varianta de Builder si poti face oricare dintre cele 3 la test/examen (cea mai buna e cu inner class) 
    }
}