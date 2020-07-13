package case2;

public class Radio {
	
	private boolean turnedOn = false;
	
	public void turnOn() {
		turnedOn = true;
		System.out.println("Radio ---ON");
	}
	
	public void turnOff() {
		turnedOn = false;
		System.out.println("Radio ---OFF");
	}
	public boolean isTurnedOn() {
		return turnedOn;
	}

}
