package Facade.Clase;

public class Salon {
    private boolean paturiLibere[] = new boolean[50];
    private static Salon instanta=null;

    private Salon() {
        this.paturiLibere = paturiLibere;
        paturiLibere[2] = true;
        paturiLibere[5] = true;
        paturiLibere[9] = true;
        paturiLibere[12] = true;
        paturiLibere[22] = true;
    }

    public int suntPaturiLibere(){
        for(int i=0;i<paturiLibere.length;i++){
            if(paturiLibere[i]==true){
                return i;
            }
        }
        return -1;
    }

    public void ocupaPat(int i){
        this.paturiLibere[i]= false;
    }

    public static Salon getInstance(){
        if(instanta==null){
            instanta = new Salon();
        }
        return instanta;
    }
}