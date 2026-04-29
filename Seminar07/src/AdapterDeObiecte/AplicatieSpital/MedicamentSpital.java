package AdapterDeObiecte.AplicatieSpital;

public class MedicamentSpital {
    public void achizitioneazaMedicament(){
        System.out.println(
                prezintaReteta() ?  "Medicament achizitionat." : "Nu are reteta valida."
        );
    }

    protected boolean prezintaReteta(){
        return true;
    }

}
