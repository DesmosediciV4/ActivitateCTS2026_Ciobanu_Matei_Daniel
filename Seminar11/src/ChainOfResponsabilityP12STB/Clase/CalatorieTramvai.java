package ChainOfResponsabilityP12STB.Clase;

public class CalatorieTramvai extends CalatorieHandler{
    @Override
    public String recomandariCalatorie(double distanta) {
        if(distanta < 10){
            return "Tramvai";
        }
        else{
            return super.succesorCalatorie.recomandariCalatorie(distanta);
        }
    }
}
