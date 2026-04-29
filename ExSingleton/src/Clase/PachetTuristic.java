//package Clase;
//
//public class PachetTuristic {
//    protected int cod;
//    protected String pachetTuristic;
//    protected int pret;
//    private static PachetTuristic instanta = null;
//
//    private PachetTuristic(String pachetTuristic, int pret) {
//        this.cod = 0;
//        this.pachetTuristic = pachetTuristic;
//        this.pret = pret;
//    }
//
//
//    public void setPret(int pret) {
//        this.pret = pret;
//    }
//
//    public void setPachetTuristic(String pachetTuristic) {
//        this.pachetTuristic = pachetTuristic;
//    }
//
//    public static synchronized PachetTuristic getInstanta(String pachetTuristic, int pret) {
//        if(instanta == null){
//            instanta = new PachetTuristic(pachetTuristic,pret);
//        }
//        return instanta;
//    }
//
//    public void afiseaza(String text) {
//        final StringBuilder sb = new StringBuilder("PachetTuristic{");
//        sb.append("cod=").append(cod);
//        sb.append(", pachetTuristic='").append(pachetTuristic).append('\'');
//        sb.append(", pret=").append(pret);
//        sb.append(", ").append(text);
//        sb.append('}');
//        this.cod++;
//        System.out.println(sb.toString());
//    }
//}
