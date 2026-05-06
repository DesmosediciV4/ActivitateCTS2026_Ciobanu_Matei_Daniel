package ChainOfResponsabilityP12STB.Clase;

public abstract class CalatorieHandler {
    CalatorieHandler succesorCalatorie;

    public CalatorieHandler(){
        this.succesorCalatorie = null;
    }

    public void setSuccesorCalatorie(CalatorieHandler succesorCalatorie) {
        this.succesorCalatorie = succesorCalatorie;
    }



    public abstract String recomandariCalatorie(double distanta);
}
