package DecoratorP7Restaurant.Decorator;

import DecoratorP7Restaurant.Clase.NotaDePlataAbstract;

public class NotaDePlata1Mai extends NotaDePlataDecorator{

    public NotaDePlata1Mai(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("la multi ani de 1 mai");
    }
}
