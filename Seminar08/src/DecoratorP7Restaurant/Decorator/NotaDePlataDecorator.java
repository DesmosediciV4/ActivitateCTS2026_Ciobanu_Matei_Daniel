package DecoratorP7Restaurant.Decorator;

import DecoratorP7Restaurant.Clase.NotaDePlataAbstract;

public abstract class NotaDePlataDecorator implements NotaDePlataAbstract {
    private NotaDePlataAbstract notaDePlata;

    public NotaDePlataDecorator(NotaDePlataAbstract notaDePlata) {
        this.notaDePlata = notaDePlata;
    }

    public abstract void printeazaFelicitare();

    @Override
    public void printeaza() {
        notaDePlata.printeaza();
    }
}
