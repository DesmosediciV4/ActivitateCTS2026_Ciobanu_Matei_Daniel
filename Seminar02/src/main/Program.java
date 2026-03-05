package main;

import clase.Angajat;
import clase.Aplicant;
import clase.Student;
import clase.readers.AngajatiReader;
import clase.readers.AplicantiReader;

import java.io.FileNotFoundException;
import java.util.List;


public class Program {

	public static void main(String[] args) {
		List<Aplicant> listaAngajati;
		Aplicant.setPragPunctaj(85);
		try {
			//listaAngajati = new AngajatiReader().readAplicanti("angajati.txt"); Nu prea e bine asa ca o sa ai mai multe readere pt fiecare fisier
			AplicantiReader ra = new AngajatiReader("angajati.txt");
			listaAngajati = ra.readAplicanti();
			for(Aplicant aplicant:listaAngajati) {
				System.out.println(aplicant.toString());
				aplicant.afisareVenit();
				aplicant.afisareStatut();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
