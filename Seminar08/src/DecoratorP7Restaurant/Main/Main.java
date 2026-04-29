package DecoratorP7Restaurant.Main;

import DecoratorP7Restaurant.Clase.NotaDePlata;
import DecoratorP7Restaurant.Clase.NotaDePlataAbstract;
import DecoratorP7Restaurant.Decorator.NotaDePlata1Mai;
import DecoratorP7Restaurant.Decorator.NotaDePlataDecorator;
import DecoratorP7Restaurant.Decorator.NotaDePlataNoulAn;

public class Main {
    public static void main(String[] args) {
        NotaDePlataAbstract notaDePlata = new NotaDePlata(108, "29/04/2026");
        notaDePlata.printeaza();

//        NotaDePlataDecorator notaDePlataDecorata = new NotaDePlataNoulAn(notaDePlata);
//        notaDePlataDecorata.printeaza();
//        notaDePlataDecorata.printeazaFelicitare(); Decoratorul poate sa apeleze si functia principala (printeaza) si printeazaFelicitare

        NotaDePlataDecorator notaDePlataDecorator;

        int a = 1;
        if(a==1){
            notaDePlataDecorator = new NotaDePlataNoulAn(notaDePlata);
        }
        else{
            notaDePlataDecorator = new NotaDePlata1Mai(notaDePlata);
        }
        notaDePlataDecorator.printeaza();
        notaDePlataDecorator.printeazaFelicitare();
    }
}