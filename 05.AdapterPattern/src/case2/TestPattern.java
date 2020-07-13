package case2;

public class TestPattern {

	public static void main(String[] args) {

		//기존에 사용하던 방식
		Aplayer p1 = new AplayerImpl();
		p1.play("aaa.mp3");
		
		//계약기간 만료로 AplayerImpl를 사용할 수 없다.
		
		Bplayer p2 = new BplayerImpl();
		p2.playFile("bbb.mp3");
		

		Aplayer p3 = new BtoAAdapter();
		p3.play("ccc.mp3");
		

		
	}

}
