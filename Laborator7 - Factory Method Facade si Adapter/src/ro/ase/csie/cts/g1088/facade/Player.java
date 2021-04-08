package ro.ase.csie.cts.g1088.facade;

public class Player {
	
	public void login(ConexiuneServerJoc conexiune) {
		System.out.println("Login player");
	}
	
	public ProfilPlayer getProfil() {
		return new ProfilPlayer();
	}

}
