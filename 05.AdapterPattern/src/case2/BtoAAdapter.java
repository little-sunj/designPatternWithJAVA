package case2;

/*
 * class adapter implementation
 * extedns와 implements를 동시에 사용해 다중 상속을 흉내내었다.
 * */
//B --> A
public class BtoAAdapter extends BplayerImpl implements Aplayer{
	
	//A의 메서드 구현
	@Override
	public void play(String fileName) {
		//A의 메소드로 B의 메서드 호출
		System.out.println("Using Adapter... :");
		playFile(fileName);
		
	}

	@Override
	public void stop() {
		
	}
	

}
