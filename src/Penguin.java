
public class Penguin extends Animal{
	
	double bloodPressure = 0;
	
	public Penguin() {
		species = "Penguin";
	}
	
	@Override
	public void newTrack() {
		Penguin myPenguin = new Penguin();		
	}

	public double getBloodPressure() {
		return bloodPressure;
	}

	public void setBloodPressure(double bloodPressure) {
		this.bloodPressure = bloodPressure;
	}

	
}
