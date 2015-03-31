
public abstract class Animal {
	//properties
	String species = "species";
	String sex = "sex";
	double weight = 0;
	
	public void addCoords() {
		
	}
	
	public abstract void newTrack();

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
