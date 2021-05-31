package aula10Heranca;

public class Student extends People{
	int registration;
	String course;
	
	public void cancelRegistration() {
		System.out.println("The studant registration has benn canceled");
	}

	public int getRegistration() {
		return registration;
	}

	public void setRegistration(int registration) {
		this.registration = registration;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}
}
