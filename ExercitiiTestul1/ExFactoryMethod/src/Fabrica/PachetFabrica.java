package Fabrica;

import Clase.PachetTuristic;

public interface PachetFabrica {
    public PachetTuristic getPachetTuristic(TipPachet tip, String denumire, String adresa);
    public PachetTuristic getPachetTuristic(TipPachet tip, String denumire, int cost);
}
