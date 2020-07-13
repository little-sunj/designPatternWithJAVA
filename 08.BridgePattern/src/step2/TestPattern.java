package step2;

//구현의 추가는 계속할 수 있다.
//RobotModel1, RobotModel2, ...
public class TestPattern {
	
	public static void main(String[] args) {
		IRobot robot = new RobotModel1();
		Cook work = new Cook(robot);
		work.powerOn();
		work.doCook();
		work.powerOff();

		System.out.println("-----------");
		
		robot = new RobotModel2();
		work = new Cook(robot);
		work.powerOn();
		work.doCook();
		work.powerOff();
	}
}
