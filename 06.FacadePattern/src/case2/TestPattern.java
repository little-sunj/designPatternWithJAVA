package case2;

public class TestPattern {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		Light l = new Light();
		Radio r = new Radio();
		
		//이전 사용 방식
		c.turnOff();
		l.turnOff();
		r.turnOff();
		
		//파사드 패턴 적용 후 방식
		HomeFacade home = new HomeFacade(c, l, r);
		home.homeIn();
		
	}

}
