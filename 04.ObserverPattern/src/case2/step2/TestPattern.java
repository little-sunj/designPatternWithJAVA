package case2.step2;

public class TestPattern {

	public static void main(String[] args) {
		
		PlayController controller = new PlayController();
		Observer ob1 = new MyClassA(controller);
		Observer ob2 = new MyClassB(controller);

		System.out.println("------모든 클래스 일시정지---------");
		
		//메시지 등록
		controller.setFlag(false);
		

		System.out.println("-----모든 클래스 다시시작----------");
		//메시지 등록
		controller.setFlag(true);
	}

}
