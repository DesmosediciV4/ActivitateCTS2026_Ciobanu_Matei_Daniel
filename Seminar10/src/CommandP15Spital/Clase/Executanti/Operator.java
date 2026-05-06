package CommandP15Spital.Clase.Executanti;

import CommandP15Spital.Clase.Comenzi.ICommand;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<ICommand> listaComenzi = new ArrayList<>();
    public void inregistreaza(ICommand iCommand){
        listaComenzi.add(iCommand);
    }

    public void executaFisa(){
        if(!listaComenzi.isEmpty()){
            //listaComenzi.get(0).executa(); merge in ambele moduri
            listaComenzi.getFirst().executa();
            listaComenzi.removeFirst();
        }
    }
}