package step1;

import java.time.LocalDate;

public class Person {
	
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String addressOne;
	private String addressTwo;
	private String sex;
	private boolean driverLicence;
	private boolean married;
	
	
	//아래처럼 생성자를 만들경우, 일부값만 초기화 하고싶어지는 케이스가 많아질수록 불편해진다. 
	/*
	 * public Person(String firstName, String lastName, LocalDate birthDate, String
	 * addressOne, String addressTwo, String sex, boolean driverLicence, boolean
	 * married) { super(); this.firstName = firstName; this.lastName = lastName;
	 * this.birthDate = birthDate; this.addressOne = addressOne; this.addressTwo =
	 * addressTwo; this.sex = sex; this.driverLicence = driverLicence; this.married
	 * = married; }
	 * 
	 * public Person(String firstName, String lastName) { super(); this.firstName =
	 * firstName; this.lastName = lastName; }
	 */




	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getAddressOne() {
		return addressOne;
	}
	public void setAddressOne(String addressOne) {
		this.addressOne = addressOne;
	}
	public String getAddressTwo() {
		return addressTwo;
	}
	public void setAddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public boolean isDriverLicence() {
		return driverLicence;
	}
	public void setDriverLicence(boolean driverLicence) {
		this.driverLicence = driverLicence;
	}
	public boolean isMarried() {
		return married;
	}
	public void setMarried(boolean married) {
		this.married = married;
	}

}
