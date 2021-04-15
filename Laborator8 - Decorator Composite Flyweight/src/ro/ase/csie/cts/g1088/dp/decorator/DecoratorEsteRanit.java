package ro.ase.csie.cts.g1088.dp.decorator;

public class DecoratorEsteRanit extends DecoratorErouAbstract {

	public static final int NIVEL_CRITIC = 200;
	
	public DecoratorEsteRanit(SuperErou erou) {
		super(erou);
		
	}
	
	public void alearga() {
		if(this.erou.getPuncteViata() < NIVEL_CRITIC) {
			System.out.println("Eroul nu mai poate alerga, este ranit");
		}
		else
			this.erou.alearga();
	}

	@Override
	public int getPuncteViata() {
		// TODO Auto-generated method stub
		return 0;
	}

}
