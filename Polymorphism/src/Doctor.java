
public class Doctor extends Person{
	String specialist;
	
	
	public Doctor() {
	}
	
	

	public Doctor(String name, String address, String specialist) {
		super(name, address);
		this.specialist = specialist;
	}



	void surgery() {
		System.out.println("I can do Surgery");
		
	}
	
	void greeting() {
		System.out.println("Halo nama saya " + name + ".");
		System.out.println("Saya berasal dari " + address + ".");
		System.out.println("Saya adalah dokter " + specialist + ".");
		
		
		
	}
}
