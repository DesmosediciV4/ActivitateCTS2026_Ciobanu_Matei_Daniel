package clase.readers;

import clase.Angajat;
import clase.Aplicant;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AngajatiReader extends AplicantiReader {

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",");
        List<Aplicant> angajati = new ArrayList<>();

        while (input.hasNext()) {
            Angajat a = new Angajat();
            super.citesteAplicant(input, a);
            int salariu = input.nextInt();
            a.setSalariu(salariu);
            String ocupatie = input.next();
            a.setOcupatie(ocupatie);
            angajati.add(a);
        }
        input.close();
        return angajati;
    }
}
