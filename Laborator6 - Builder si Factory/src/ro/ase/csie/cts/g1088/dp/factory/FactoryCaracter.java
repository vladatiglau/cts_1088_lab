package ro.ase.csie.cts.g1088.dp.factory;

import javax.sound.sampled.UnsupportedAudioFileException;

public class FactoryCaracter {
	
	public static CaracterAbstract getCaracter(TipCaracter tip, 
			String nume) {
		CaracterAbstract caracter = null;
		
		switch (tip) {
		case DISNEY:
			caracter = new CaracterDisney("alb", nume);
			break;
		case MARVEL:
			caracter = new CaracterMarvel(nume, 50);
			break;
			default:
				throw new UnsupportedOperationException();
		}
		return caracter;
	}

}
