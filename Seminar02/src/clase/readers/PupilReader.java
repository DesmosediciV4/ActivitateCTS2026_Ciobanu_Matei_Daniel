package clase.readers;

import clase.Aplicant;
import clase.Elev;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PupilReader extends AplicantiReader {

    @Override
    public List<Aplicant> readAplicanti(String file) throws FileNotFoundException {
        Scanner input = new Scanner(new File(file));
        input.useDelimiter(",|\n");
        List<Aplicant> elevi = new ArrayList<>();

        while (input.hasNext()) {
            Elev e = new Elev();
            super.citesteAplicant(input, e);
            int clasa = input.nextInt();
            e.setClasa(clasa);
            String tutore = input.next();
            e.setTutore(tutore);
            elevi.add(e);
        }

        input.close();
        return elevi;
    }
}
