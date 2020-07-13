package case1;

public class ComplexProduct {
	char nameChars[] = new char[10];

	public ComplexProduct() {
	}
	
	public void setFirstNameCharacter(char c) {
		nameChars[0] = c;
	}
	public void setSecondNameCharacter(char c) {
		nameChars[1] = c;
	}
	public void setThirdNameCharacter(char c) {
		nameChars[2] = c;
	}
	public void setFourthNameCharacter(char c) {
		nameChars[3] = c;
	}
	public void setFifthNameCharacter(char c) {
		nameChars[4] = c;
	}
	public void setSixthNameCharacter(char c) {
		nameChars[5] = c;
	}
	
	public String getName() {
		return new String(nameChars);
	}

}
