package ro.ase.csie.cts.g1088.adapter;

import java.util.ArrayList;

import ro.ase.csie.cts.g1088.factory.method.CaracterDisney;
import ro.ase.csie.cts.g1088.factory.method.CaracterJoc;

public class TestAdapter {

	public static void main(String[] args) {

		ArrayList<CaracterJoc> caractere = new ArrayList<>();
		caractere.add(new CaracterDisney("Donald"));
		
		ArrayList<InterfataCaracterEA> caracterEAs = new ArrayList<>();
		caracterEAs.add(new CaracterGenericEA());
		
		InterfataCaracterEA caracterEA = new CaracterGenericEA();
		AdapterEA2CaracterJoc adapt = new AdapterEA2CaracterJoc(caracterEA);
		caractere.add(adapt);
		

	}

}
