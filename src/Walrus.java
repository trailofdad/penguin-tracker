
public class Walrus extends Animal{
	
	String dentalHealth = "Good";
	
	Walrus(){
		species = "Walrus";
	}
	
	@Override
	public void newTrack() {
		Walrus myWalrus = new Walrus();
		
	}

	public String getDentalHealth() {
		return dentalHealth;
	}

	public void setDentalHealth(String dentalHealth) {
		this.dentalHealth = dentalHealth;
	}
	
	
}
