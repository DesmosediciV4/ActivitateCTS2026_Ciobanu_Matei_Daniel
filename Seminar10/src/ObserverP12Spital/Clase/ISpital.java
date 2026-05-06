package ObserverP12Spital.Clase;

public interface ISpital {
    void trimiteMesaj(String mesaj);
    void abonarePacient(IPacient iPacient);
    void dezabonarePacient(IPacient iPacient);
}
