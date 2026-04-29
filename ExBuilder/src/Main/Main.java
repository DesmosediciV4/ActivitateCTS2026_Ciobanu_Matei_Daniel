package Main;

import BuilderAlternativ.PachetBuilderAlternativ;
import BuilderEager.Pachet;
import BuilderEager.PachetBuilder;

public class Main {
    public static void main(String[] args) {
        Pachet pachet = new Pachet("Bahamas",false,false,false,false,false);
        PachetBuilder builder = new PachetBuilder("Tenerife");
        Pachet pachet2 = builder.build();
        Pachet pachet3 = builder.setNume("Tenerife Extra").setWifi(true).setPet(true).setSmoker(true).setAc(true).setTv(true).build();
        System.out.println(pachet);
        System.out.println(pachet2);
        System.out.println(pachet3);

        PachetBuilderAlternativ builderAlternativ = new PachetBuilderAlternativ();
        Pachet pachet4 = builderAlternativ.build("Zanzibar");
        Pachet pachet5 = builderAlternativ.setPet(true).build("Zanzibar++");
        System.out.println(pachet4);
        System.out.println(pachet5);
    }
}