package case2;

public class Computer {
	private boolean turnedOn = false;
	
	public void turnOn() {
		turnedOn = true;
		System.out.println("Computer ---ON");
	}
	
	public void turnOff() {
		turnedOn = false;
		System.out.println("Computer ---OFF");
	}
	public boolean isTurnedOn() {
		return turnedOn;
	}

}
