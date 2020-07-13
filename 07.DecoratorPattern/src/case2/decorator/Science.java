package case2.decorator;

import case2.base.Student;

public class Science extends StudentDecorator{
	
private Student student;
	
	public Science(Student student) {
		this.student = student;
	}

	@Override
	public String getDescription() {
		return student.getDescription() + " + Like Science";
	}
	
	public void calculateStuff() {
		System.out.println("scientific calculation");
	}
	

}
