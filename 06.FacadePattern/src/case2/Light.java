package case2;

public class Light {
	
	private boolean turnedOn = false;
	
	public void turnOn() {
		turnedOn = true;
		System.out.println("Light ---ON");
	}
	
	public void turnOff() {
		turnedOn = false;
		System.out.println("Light ---OFF");
	}
	public boolean isTurnedOn() {
		return turnedOn;
	}

}
