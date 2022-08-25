package oopIntroTasks;

public class Main {

	public static void main(String[] args) {
		Computer computer1 = new Computer(1,"Matebook D15",8,"intel i5");
		Computer computer2 = new Computer(2,"Monster notebook",16,"intel i7");
		
		
		Computer[] computers = {computer1,computer2};
		
		for(Computer computer:computers) {
			System.out.println(computer.name);
		}
		
		ComputerManager computerManager = new ComputerManager();
		
		computerManager.nameQuery(computer1);
		computerManager.ramQuery(computer2);
		

	}

}
