package case1;

public class TestPattern {

	public static void main(String[] args) {
		
		PlayController controller = new PlayController();

		MyClassA a = new MyClassA(controller);
		MyClassB b = new MyClassB(controller);
		
		System.out.println("-----모든 클래스 일시 정지---");
		controller.setFlag(false);
		
		System.out.println();
		System.out.println("-----모든 클래스 다시 시작---");
		controller.setFlag(true);
		
		System.out.println();
	}

}
