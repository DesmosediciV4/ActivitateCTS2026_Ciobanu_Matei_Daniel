package ChainOfResponsabilityP12STB.Main;

import ChainOfResponsabilityP12STB.Clase.*;

public class Main {
    public static void main(String[] args) {
        CalatorieHandler calatorieTroleibuz = new CalatorieTroileibuz();
        CalatorieHandler calatorieAutobuz = new CalatorieAutobuz();
        CalatorieHandler calatorieTramvai = new CalatorieTramvai();
        CalatorieHandler calatorieMetrou = new CalatorieMetrou();

        calatorieTroleibuz.setSuccesorCalatorie(calatorieAutobuz);
        calatorieAutobuz.setSuccesorCalatorie(calatorieMetrou); //Am modificat din tramvai in metrou is l-am sarit pt ca nu circula tramvaiul
        //calatorieTramvai.setSuccesorCalatorie(calatorieMetrou); am facut asta direct la rulare si asta e avantajul la chainOfResponsability

        System.out.println(calatorieTroleibuz.recomandariCalatorie(5));
        System.out.println(calatorieAutobuz.recomandariCalatorie(12));
        System.out.println(calatorieTramvai.recomandariCalatorie(2));
        System.out.println(calatorieMetrou.recomandariCalatorie(4));
    }
}