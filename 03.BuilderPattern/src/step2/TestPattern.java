package step2;

import java.time.LocalDate;
import java.time.Month;

public class TestPattern {

	public static void main(String[] args) {
		
		Person p1 = Person.builder()
				.FirstName("SUN")
				.LastName("Jung")
				.AddressOne("Seoul")
				.AddressTwo("Korea")
				.BirthDate(LocalDate.of(1989, Month.APRIL, 6))
				.Sex("female")
				.DriverLicence(true)
				.Married(false)
				.build();
		
		System.out.println(p1.getBirthDate());
	}
}
