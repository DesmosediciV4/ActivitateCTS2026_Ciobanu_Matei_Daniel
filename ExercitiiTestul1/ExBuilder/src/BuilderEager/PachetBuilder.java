package BuilderEager;

public class PachetBuilder implements PachetBuilderAbstract {
    private Pachet pachet;

    public PachetBuilder(String nume){
        this.pachet = new Pachet(nume, false,false,false,false,false);
    }

    public PachetBuilder setNume(String nume){
        pachet.numePachet = nume;
        return this;
    }

    public PachetBuilder setWifi(boolean wifi) {
        pachet.wifi = wifi;
        return this;
    }

    public PachetBuilder setPet(boolean pet) {
        pachet.pet = pet;
        return this;
    }

    public PachetBuilder setSmoker(boolean smoker) {
        pachet.smoker = smoker;
        return this;
    }

    public PachetBuilder setAc(boolean ac) {
        pachet.ac = ac;
        return this;
    }

    public PachetBuilder setTv(boolean tv) {
        pachet.tv = tv;
        return this;
    }

    @Override
    public Pachet build() {
        return pachet;
    }
}
