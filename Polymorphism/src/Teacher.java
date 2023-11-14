
public class Teacher extends Person {
	String subject;
	
	public Teacher() {
		
	}
	
	public Teacher(String name, String address, String subject) {
		super(name, address);
		this.subject = subject;
	}



	void teaching() {
		System.out.println("I can teach " + subject + ", so anyone who wants to learn talk to me");
		
	}
	
	void greeting() {
		System.out.println("Halo nama saya " + name + ".");
		System.out.println("Saya berasal dari " + address + ".");
		System.out.println("Saya adalah guru " + subject );
	}
}
