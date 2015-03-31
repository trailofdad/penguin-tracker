
public class Walrus extends Animal{
	
	boolean dentalHealth = true;
	
	Walrus(){
		species = "Walrus";
	}
	
	@Override
	public void newTrack() {
		Walrus myWalrus = new Walrus();
		
	}

	public boolean isDentalHealth() {
		return dentalHealth;
	}

	public void setDentalHealth(boolean dentalHealth) {
		this.dentalHealth = dentalHealth;
	}

}
