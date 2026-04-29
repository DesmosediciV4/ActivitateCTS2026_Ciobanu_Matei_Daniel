package BuilderAlternativ;

import BuilderEager.Pachet;
import BuilderEager.PachetBuilder;

public class PachetBuilderAlternativ implements PachetBuilderAbstractAlternativ{
    private boolean wifi;
    private boolean pet;
    private boolean smoker;
    private boolean ac;
    private boolean tv;

    public PachetBuilderAlternativ() {
        this.wifi = false;
        this.pet = false;
        this.smoker = false;
        this.ac = false;
        this.tv = false;
    }


    public PachetBuilderAlternativ setWifi(boolean wifi) {
        this.wifi = wifi;
        return this;
    }

    public PachetBuilderAlternativ setPet(boolean pet) {
        this.pet = pet;
        return this;
    }

    public PachetBuilderAlternativ setSmoker(boolean smoker) {
        this.smoker = smoker;
        return this;
    }

    public PachetBuilderAlternativ setAc(boolean ac) {
        this.ac = ac;
        return this;
    }

    public PachetBuilderAlternativ setTv(boolean tv) {
        this.tv = tv;
        return this;
    }

    @Override
    public Pachet build(String nume) {
        Pachet pachet = new Pachet(nume,this.pet,this.wifi,this.smoker,this.ac,this.tv);
        return pachet;
    }
}
