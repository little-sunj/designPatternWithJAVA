package case2.step2;


public class MyClassA implements Observer{
	
	Publisher observable; //등록될 Observable
	private boolean bPlay; //실행여부
	
	//생성될 때 직접 자기 자신을 옵저버에 등록한다.
	public MyClassA(Publisher o) {
		this.observable = o;
		observable.addObserver(this);
	}
	
	@Override
	public void update(boolean play) {
		this.bPlay = play;
		myActControl();
	}
	
	public void myActControl() {
		if(bPlay) {
			System.out.println("MyClassA : 동작을 시작합니다");
		}else {
			System.out.println("MyClassA : 동작을 정지합니다");
		}
	}
}
