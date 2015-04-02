
public class Walrus extends Animal{
	
	String dentalHealth;
	
	// multi-parameter constructor
	Walrus(){
		species = "Walrus";
		dentalHealth = "good";
	}

	public String getDentalHealth() {
		return dentalHealth;
	}

	public void setDentalHealth(String dentalHealth) {
		this.dentalHealth = dentalHealth;
	}
	
	
}
