package ChainOfResponsabilityP12STB.Clase;

public class CalatorieTroileibuz extends CalatorieHandler{
    @Override
    public void setSuccesorCalatorie(CalatorieHandler succesorCalatorie) {
        super.setSuccesorCalatorie(succesorCalatorie);
    }

    @Override
    public String recomandariCalatorie(double distanta) {
        if(distanta < 3){
            return "Troleibuz";
        }
        else{
            return super.succesorCalatorie.recomandariCalatorie(distanta);
        }
    }
}
