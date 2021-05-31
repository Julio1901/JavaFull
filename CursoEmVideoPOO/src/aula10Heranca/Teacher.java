package aula10Heranca;

public class Teacher extends People{
	private String specialty;
	private float wage;
	
	public void receiveSalaryIncrease(float salaryIncrease) {
		this.wage += salaryIncrease;
	}

	public String getSpecialty() {
		return specialty;
	}

	public void setSpecialty(String specialty) {
		this.specialty = specialty;
	}

	public float getWage() {
		return wage;
	}

	public void setWage(float wage) {
		this.wage = wage;
	}
}
