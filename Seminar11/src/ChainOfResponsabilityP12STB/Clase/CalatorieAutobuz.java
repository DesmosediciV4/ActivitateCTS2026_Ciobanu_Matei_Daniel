package ChainOfResponsabilityP12STB.Clase;

public class CalatorieAutobuz extends CalatorieHandler{
    @Override
    public String recomandariCalatorie(double distanta) {
        if(distanta < 5){
            return "Autobuz";
        }
        else{
            return super.succesorCalatorie.recomandariCalatorie(distanta);
        }
    }
}
