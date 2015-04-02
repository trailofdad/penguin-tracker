
public class Sealion extends Animal{

	int numSpots = 0;
	
	Sealion() {
		species = "Sea Lion";
	}
	
	@Override
	public void newTrack() {
		Sealion mySealion = new Sealion();
		
	}

	public int getNumSpots() {
		return numSpots;
	}

	public void setNumSpots(int numSpots) {
		this.numSpots = numSpots;
	}



}
