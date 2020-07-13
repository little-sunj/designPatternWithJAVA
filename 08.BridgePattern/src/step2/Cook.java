package step2;

public class Cook extends IAction {

	public Cook(IRobot robot) {
		super(robot);
	}

	//행동(요리)추가
	public void doCook() {
		System.out.println("요리를 합니다.");
	}
}
