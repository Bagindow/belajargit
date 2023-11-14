
public class MainApp {

	public static void main(String[] args) {
		Person person1 = new Programmer ("Andika", "Bandung", ".Net Core");
		Person person2 = new Teacher ("Doeng", "Kiaracondong", "Bahasa Arab");
		Person person3 = new Doctor ("Wawan", "Kajarta", "Pedistrician");
		
		sayHello(person1);
		sayHello(person2);
		sayHello(person3);
		
		
	}
	
	static void sayHello(Person person) {
		String massage;
		if(person instanceof Programmer) {
			Programmer programmer = (Programmer) person;
			massage = "Hello, " + programmer.name + ". Seorang Programmer " + programmer.technology +".";			
		}else if(person instanceof Teacher) {
			Teacher teacher = (Teacher) person;
			massage = "Hello, " + teacher.name + ". Seorang Guru " + teacher.subject + ".";
		}else if (person instanceof Doctor) {
			Doctor doctor = (Doctor) person;
			massage = "Hello, " + doctor.name + ". Seorang Dokter " + doctor.specialist + ".";
		}else {
			massage = "Hello, " + person.name;
		}
		System.out.println(massage);
	}

}
