package FlyWeightP10Restaurant.Clase;

import java.util.HashMap;
import java.util.Map;

public class RegistruClienti {
    private Map<String, ClientAbstract> clienti = new HashMap<>();

    public ClientAbstract getClient(String nume, String nrTel, String email) {
        ClientAbstract client = clienti.get(nrTel);
        if(client==null){
            client = new Client(nume,nrTel,email);
            clienti.put(nrTel,client);
        }
        return client;
    }
}
