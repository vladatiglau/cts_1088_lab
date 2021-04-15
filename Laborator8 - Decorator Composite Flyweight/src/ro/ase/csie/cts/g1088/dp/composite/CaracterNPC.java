package ro.ase.csie.cts.g1088.dp.composite;

public class CaracterNPC extends UnitateAbstractaJoc {
	
	String tip;
	int putere;
	

	public CaracterNPC(String tip, int putere) {
		super();
		this.tip = tip;
		this.putere = putere;
	}

	@Override
	public void seDeplaseaza(int x, int y) {
		System.out.println(String.format("%s se deplaseaza"));
	}

	@Override
	public void atacaJucator(int puncte) {
		System.out.println(String.format("%s ataca jucatorul"));

		
	}

	@Override
	public void seRetrage() {
		System.out.println(String.format("%s se retrage"));

		
	}

	//@Override
	//public void adaugaCaracter(UnitateAbstractaJoc unitate) {
	//	throw new UnsupportedOperationException();
		
	//}

	//@Override
	////public void stergeCaracter(UnitateAbstractaJoc unitate) {
	//	throw new UnsupportedOperationException();
		
	//}

	//@Override
	//public UnitateAbstractaJoc getCarcater(int index) {
	//	throw new UnsupportedOperationException();

	//}

}
