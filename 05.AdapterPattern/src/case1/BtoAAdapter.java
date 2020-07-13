package case1;

//B --> A
public class BtoAAdapter implements Aplayer{
	
	private Bplayer media;
	
	public BtoAAdapter(Bplayer media) {
		this.media = media;
	}

	@Override
	public void play(String fileName) {
		//A의 메소드로 B의 메서드 호출
		System.out.println("Using Adapter... :");
		media.playFile(fileName);
		
	}

	@Override
	public void stop() {
		System.out.println("Using Adapter... :");
		media.stopFile();
		
	}
	
	/*
	 * 기존 코드에서 수정해야 할 노력과 분량을 어댑터 클래스 생성에 사용.
	 * 기존에 잘 사용되던 클래스이므로
	 * 버그가 발생하면 어댑터 클래스를 집중적으로 체크
	 * */

}
