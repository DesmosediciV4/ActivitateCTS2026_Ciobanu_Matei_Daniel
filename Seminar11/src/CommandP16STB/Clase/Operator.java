package CommandP16STB.Clase;

import java.util.ArrayList;
import java.util.List;

public class Operator {
    private List<Command> listaComenzi;

    public Operator(){
        this.listaComenzi = new ArrayList<>();
    }

    public void invocaComanda(Command command){
        listaComenzi.add(command);
    }

    public void executaComanda(){
        if(listaComenzi.size()>0){
            listaComenzi.getFirst().pleacaInCursa();
            listaComenzi.removeFirst();
        }
    }
}
