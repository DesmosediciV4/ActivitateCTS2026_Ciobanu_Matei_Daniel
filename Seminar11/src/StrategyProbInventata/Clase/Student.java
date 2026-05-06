package StrategyProbInventata.Clase;

public class Student {
    private String nume;
    private IModSustinere modSustinere;

    public Student(String nume) {
        this.nume = nume;
        this.modSustinere = new ProbaGrila();
    }

    public Student() {
        this.nume = "Jane Doe";
        this.modSustinere = new ProbaGrila();
    }

    public IModSustinere getModSustinere() {
        return modSustinere;
    }

    public void setModSustinere(IModSustinere modSustinere) {
        this.modSustinere = modSustinere;
    }

    public void initiereExamen(){
        modSustinere.sustinereExamen();
    }
}
