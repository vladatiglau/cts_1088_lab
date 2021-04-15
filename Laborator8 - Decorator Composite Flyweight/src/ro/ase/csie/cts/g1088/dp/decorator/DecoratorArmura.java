package ro.ase.csie.cts.g1088.dp.decorator;

public class DecoratorArmura extends DecoratorErouAbstract {
	
	int nivelArmura;

	public DecoratorArmura(SuperErou erou, int nivelArmura) {
		super(erou);
		this.nivelArmura = nivelArmura;
		
		
	}

}
