package singleton.clase;

public class Logger {
    protected int cod;
    protected String sender;
    protected String categorie;
    private static Logger instanta = null;

    private Logger(String sender, String categorie) {
        this.cod = 0;
        this.sender = sender;
        this.categorie = categorie;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public void setCategorie(String categorie) {
        this.categorie = categorie;
    }

    public static synchronized Logger getInstanta(String sender,String categorie) {
        if(instanta == null){
            instanta = new Logger(sender,categorie);
        }
        return instanta;
    }

    public void afiseazaLog(String text){
        System.out.println("Log cu ID: " + cod + ", " + sender + " a salvat un log din categoria: " + categorie + ", care a constat in " + text);
        this.cod++;
    }
}
