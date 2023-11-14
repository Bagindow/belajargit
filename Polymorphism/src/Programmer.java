
public class Programmer extends Person {
	String technology;
	
	public Programmer() {
	}

	public Programmer(String name, String address, String technology) {
		super(name, address);
		this.technology = technology;
	}

	void hacking() {
		System.out.println("i can hack a website");
	}
	
	void coding() {
		System.out.println("|I can create a an aplication using technology : " + technology + ".");
		
	}
	
	void greeting() {
		super.greeting();
		System.out.println("Pekerjaan saya adalah " + technology + " Programmer");
		
	}
		
		
		
	

}
