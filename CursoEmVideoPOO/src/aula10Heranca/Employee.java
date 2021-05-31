package aula10Heranca;

public class Employee extends People{
	private String sector;
	private boolean working;
	
	public void changeWork() {
		this.working = ! this.working;
	}

	public String getSector() {
		return sector;
	}

	public void setSector(String sector) {
		this.sector = sector;
	}

	public boolean isWorking() {
		return working;
	}

	public void setWorking(boolean working) {
		this.working = working;
	}
	
}
