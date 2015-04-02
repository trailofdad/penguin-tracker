
public abstract class Animal {
	
	//properties
	String species = "species";
	String sex = "sex";
	double weight = 0;
	
	//instanced tracker class
	Tracker animalTracker = new Tracker();
	
	//Method to inherit for adding coordinates
	public void addCoords(String[] lat,String[] lon) {
		
		this.animalTracker.setLatitude(lat);
		this.animalTracker.setLongitude(lon);
	}
		

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
}
