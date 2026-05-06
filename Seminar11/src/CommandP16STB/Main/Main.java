package CommandP16STB.Main;

import CommandP16STB.Clase.Autobuz;
import CommandP16STB.Clase.Command;
import CommandP16STB.Clase.Operator;
import CommandP16STB.Clase.Plecare;

public class Main {
    public static void main(String[] args) {
        Operator operator = new Operator();
        Command command = new Plecare(new Autobuz("Mercedes-Benz","B210STB"),120);
        Command command1 = new Plecare(new Autobuz("MAN","B211STB"),310);

        operator.invocaComanda(command);
        operator.invocaComanda(command1);
        operator.invocaComanda(new Plecare(new Autobuz("Tatra","B219STB"),90));

        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
        operator.executaComanda();
    }
}
