package DecoratorP7Restaurant.Decorator;

import DecoratorP7Restaurant.Clase.NotaDePlataAbstract;

public class NotaDePlataNoulAn extends NotaDePlataDecorator{

    public NotaDePlataNoulAn(NotaDePlataAbstract notaDePlata) {
        super(notaDePlata);
    }

    @Override
    public void printeazaFelicitare() {
        System.out.println("La multi ani! An nou fericit!");
    }
}
