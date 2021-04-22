package ro.ase.csie.cts.g1088.flyweight;
import java.util.HashMap;
import java.util.Map;

public class Model3DFactory {
	
	public static Map<String, InterfataFlyweightModel3D> modele = 
			new HashMap<>();
	
	static {
		modele.put(TipModel3D.CLADIRE.toString(), new FlyweightModel3D("Cladire"));
		modele.put(TipModel3D.SOLDAT.toString(), new FlyweightModel3D("Soldat"));
	}
	
	public static InterfataFlyweightModel3D getModel3d(TipModel3D tip) {
		return modele.get(tip.toString());
	}
	

}
