package singleton.program;

import singleton.clase.Logger;

public class Main {
    public static void main(String[] args) {
        Logger instance =  Logger.getInstanta("Interfata", "afisare");
        instance.afiseazaLog("Fisierul JSON este afisat corect.");
        instance.afiseazaLog("eroare");
        Logger instance2 = Logger.getInstanta("Backend", "baza de date");
        instance2.afiseazaLog("salvare in BD reusita!");
        instance2.setSender("Backend");
        instance2.setCategorie("baza de date");
        instance2.afiseazaLog("salvare in BD reusita!");
        //Logger instance3 = new Logger(); Sa pui asta la examen sa te asiguri ca ai Singleton si ca ai constructor privat, testezi, da eroare e perf, o stergi
        //La examen ca aici apelezi de 2 ori getInstance() ca sa arati ca e acelasi si nu se da override
    }
}