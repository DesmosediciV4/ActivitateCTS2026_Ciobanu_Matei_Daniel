package StrategyProbInventata.Main;

import StrategyProbInventata.Clase.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Marcel");
        student.initiereExamen();

        student.setModSustinere(new ProbaOrala());
        student.initiereExamen();

        student.setModSustinere(new ProbaScrisa());
        student.initiereExamen();

    }
}
