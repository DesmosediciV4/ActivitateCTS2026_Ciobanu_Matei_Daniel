package Builder;

public class InternareBuilder implements InternareBuilderAbstract {
    private Internare internare;

    public InternareBuilder(String nume) {
        this.internare = new Internare(nume, false, false, false, false);
    }

    public InternareBuilder setNume(String nume){
        internare.numePacient = nume;
        return this;
    }

    public InternareBuilder setPat(boolean arePat){
        internare.patRabatabil = arePat;
        return this;
    }

    public InternareBuilder setMicDejun(boolean areMicDejun){
        internare.micDejun = areMicDejun;
        return this;
    }

    public InternareBuilder setPapuci(boolean arePapuci){
        internare.papuci = arePapuci;
        return this;
    }

    public InternareBuilder setHalat(boolean areHalat){
        internare.halat = areHalat;
        return this;
    }

    @Override
    public Internare build() {
        return internare;
    }
}
