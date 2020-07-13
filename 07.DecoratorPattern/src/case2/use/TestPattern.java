package case2.use;

import case2.base.AmericanStudent;
import case2.base.Student;
import case2.decorator.Art;
import case2.decorator.Science;

public class TestPattern {

	public static void main(String[] args) {
		Student s1 = new AmericanStudent();
		System.out.println(s1.getDescription());
		
		Science s2 = new Science(s1);
		System.out.println(s2.getDescription());
		
		Art s3 = new Art(s2);
		System.out.println(s3.getDescription());

	}

}
