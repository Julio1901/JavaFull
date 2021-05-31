package aula10Heranca;

public class Main {

	public static void main(String[] args) {
		People p1 = new People();
		Student p2 = new Student();
		Teacher p3 = new Teacher();
		Employee p4 = new Employee();
		
		p1.setName("Pedro");
		p2.setName("Maria");
		p3.setName("Claudio");
		p4.setName("Fabiana");

		p1.setGender("M");
		p4.setGender("F");
		p2.setAge(18);
		
		p2.setCourse("Computing");
		p3.setWage(2500.75f);
		p4.setSector("Stock");
		
		People[] allPeople = {p1,p2,p3,p4};
		
		for (int i = 0; i < allPeople.length; i++) {
			System.out.println(allPeople[i].toString());
		}
		
		
	}

}
