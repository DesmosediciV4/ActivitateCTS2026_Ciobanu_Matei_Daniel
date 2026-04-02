package BuilderEager;

public class Pachet {
    protected String numePachet;
    protected boolean wifi;
    protected boolean pet;
    protected boolean smoker;
    protected boolean ac;
    protected boolean tv;

    public Pachet(String numePachet, boolean pet, boolean wifi, boolean smoker, boolean ac, boolean tv) {
        this.numePachet = numePachet;
        this.pet = pet;
        this.wifi = wifi;
        this.smoker = smoker;
        this.ac = ac;
        this.tv = tv;
    }

    public void setNumePachet(String numePachet) { this.numePachet = numePachet; }

    public void setWifi(boolean wifi) {
        this.wifi = wifi;
    }

    public void setPet(boolean pet) {
        this.pet = pet;
    }

    public void setSmoker(boolean smoker) {
        this.smoker = smoker;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pachet{");
        sb.append("numePachet='").append(numePachet).append('\'');
        sb.append(", wifi=").append(wifi);
        sb.append(", pet=").append(pet);
        sb.append(", smoker=").append(smoker);
        sb.append(", ac=").append(ac);
        sb.append(", tv=").append(tv);
        sb.append('}');
        return sb.toString();
    }
}
