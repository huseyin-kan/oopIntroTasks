package oopIntroTasks;

public class Computer {
	public Computer() {
		System.out.println("Class has been called");
	}
	
	public Computer(int id,String name,int ram,String cpu) {
		this.id=id;
		this.name=name;
		this.ram=ram;
		this.cpu=cpu;
	}
	
	int id;
	String name;
	int ram;
	String cpu;
}
