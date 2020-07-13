package step2;

import java.time.LocalDate;

public class PersonBuilder {
	
	private String firstName;
	private String lastName;
	private LocalDate birthDate;
	private String addressOne;
	private String addressTwo;
	private String sex;
	private boolean driverLicence;
	private boolean married;
	
	public PersonBuilder FirstName(String firstName) {
		this.firstName = firstName;
		return this;
	}
	public PersonBuilder LastName(String lastName) {
		this.lastName = lastName;
		return this;
	}
	public PersonBuilder BirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
		return this;
	}
	public PersonBuilder AddressOne(String addressOne) {
		this.addressOne = addressOne;
		return this;
	}
	public PersonBuilder AddressTwo(String addressTwo) {
		this.addressTwo = addressTwo;
		return this;
	}
	public PersonBuilder Sex(String sex) {
		this.sex = sex;
		return this;
	}
	public PersonBuilder DriverLicence(boolean driverLicence) {
		this.driverLicence = driverLicence;
		return this;
	}
	public PersonBuilder Married(boolean married) {
		this.married = married;
		return this;
	}
	
	public Person build() {
		
		Person person = new Person();
		person.setFirstName(firstName);
		person.setLastName(lastName);
		person.setBirthDate(birthDate);
		person.setAddressOne(addressOne);
		person.setAddressTwo(addressTwo);
		person.setSex(sex);
		person.setDriverLicence(driverLicence);
		person.setMarried(married);
		return person;
	}
	

}
