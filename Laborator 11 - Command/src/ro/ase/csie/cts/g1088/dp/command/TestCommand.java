package ro.ase.csie.cts.g1088.dp.command;

public class TestCommand {

	public static void main(String[] args) {
		
		ManagerTaskuri manager = new ManagerTaskuri();
		
		manager.adaugaTask(new TaskAsincron(new ModulUpdate(), "10.1", 5));
		manager.adaugaTask(new TaskAsincron(new ModulAutoSave(), "Salvare automata nivel 5", 1));

		System.out.println("Jocul continua....");
		
		manager.ecexutaUrmatorulTask();
		
		System.out.println("Jocul continua....");

		manager.ecexutaUrmatorulTask();
		
		System.out.println("Jocul continua....");

		
	}

}
