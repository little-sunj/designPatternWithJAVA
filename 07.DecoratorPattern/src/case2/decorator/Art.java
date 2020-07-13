package case2.decorator;

import case2.base.Student;

public class Art extends StudentDecorator{
	
	private Student student;
	
	public Art(Student student) {
		this.student = student;
	}

	@Override
	public String getDescription() {
		return student.getDescription() + " + Like Art";
	}
	
	public void draw() {
		System.out.println("draw");
	}

}
