package BuilderEager;

public class Internare {
    protected String numePacient;
    protected boolean patRabatabil;
    protected boolean micDejun;
    protected boolean papuci;
    protected boolean halat;

    public Internare(String numePacient, boolean patRabatabil, boolean micDejun, boolean papuci, boolean halat) {
        this.numePacient = numePacient;
        this.patRabatabil = patRabatabil;
        this.micDejun = micDejun;
        this.papuci = papuci;
        this.halat = halat;
    }

    public void setNumePacient(String numePacient) {
        this.numePacient = numePacient;
    }

    public void setPatRabatabil(boolean patRabatabil) {
        this.patRabatabil = patRabatabil;
    }

    public void setMicDejun(boolean micDejun) {
        this.micDejun = micDejun;
    }

    public void setHalat(boolean halat) {
        this.halat = halat;
    }

    public void setPapuci(boolean papuci) {
        this.papuci = papuci;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Internare{");
        sb.append("numePacient='").append(numePacient).append('\'');
        sb.append(", patRabatabil=").append(patRabatabil);
        sb.append(", micDejun=").append(micDejun);
        sb.append(", papuci=").append(papuci);
        sb.append(", halat=").append(halat);
        sb.append('}');
        return sb.toString();
    }
}
