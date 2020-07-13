package case2.step1;

import java.util.ArrayList;
import java.util.List;


//감시의 대상
public class PlayController implements Publisher{
	
	private List<Observer> observers = new ArrayList<>();
	private boolean play;

	@Override
	public void addObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void deleteObserver(Observer observer) {
		int index = observers.indexOf(observer);
		observers.remove(index);
		
	}

	@Override
	public void notifyObservers() {
		for(Observer observer : observers) {
			observer.update(play);
		}
		
	}
	
	public void setFlag(boolean play) {
		this.play = play;
		notifyObservers();
	}
	
	public boolean getFlag() {
		return play;
	}
	
}
