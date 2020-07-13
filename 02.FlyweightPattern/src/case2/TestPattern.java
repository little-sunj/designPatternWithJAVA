package case2;

public class TestPattern {

	public static void main(String[] args) {
		
		FlyweightFactory fw = new FlyweightFactory();
		fw.getSubject("a");
		fw.getSubject("a");
		fw.getSubject("b");
		fw.getSubject("b");

	}

}
