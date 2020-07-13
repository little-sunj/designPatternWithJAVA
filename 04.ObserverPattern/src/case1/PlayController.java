package case1;

import java.util.Observable;

//감시의 대상
public class PlayController extends Observable{
	
	private boolean bPlay; //실행 여부
	
	public PlayController() {
		
	}
	
	//데이터를 전달 받아 플래그 값을 변경하고,
	//새로운 데이터가 들어왔음을 알린다.
	public void setFlag(boolean bPlay) {
		this.bPlay = bPlay;
		setChanged();
		notifyObservers();
		//Observerable 안에 모두 구현되어있기 때문에 메서도 호출만 해주면 된다.
	}
	
	//실행여부 플래그 값 반환
	public boolean getFlag() {
		return bPlay;
	}

	
}
