package case1;

import java.util.Observable;
import java.util.Observer; //The type Observer is deprecated since version 9


public class MyClassB implements Observer{
	
	Observable observable; //등록될 Observable
	private boolean bPlay; //실행여부
	
	public MyClassB(Observable o) {
		this.observable = o;
		Observable.addObserver(this);	//옵저버에 현재 클래스 등록
	}
	
	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof PlayController) {
			PlayController myControl = (PlayController)o;
			this.bPlay = myControl.getFlag();
			myActControl();
		}
		
	}
	
	public void myActControl() {
		if(bPlay) {
			System.out.println("MyClassB : 동작을 시작합니다");
		}else {
			System.out.println("MyClassB : 동작을 정지합니다");
			observable.deleteObserver(this); //옵저버를 삭제 (이후 옵저버 연락을 받지 못하게된다.)
		}
	}

}
