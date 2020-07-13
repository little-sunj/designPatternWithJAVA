package case1.step2;

public class AObj {
	
	BInterface bInterface;
	
	public AObj() {
		bInterface = new BImplement();
	}
	public void SomeFunc() {
		//수행
		//기능 구현을 위임. Delegate
		bInterface.funcA();
		bInterface.funcA();
	}

}
