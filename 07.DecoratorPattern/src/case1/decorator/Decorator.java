package case1.decorator;

import case1.base.IceCream;

//첨가물을 나타내는 Abstract 클래스 (Decorator 클래스)
//데코레이터 클래스의 형식은 그 클래스가 감싸고 있는 클래스의 형식을 반영한다.
//그러므로, IceCream객체가 들어갈 자리에 들어갈 수 있어야 하므로 IceCream클래스를 상속한다.

public abstract class Decorator extends IceCream {
	
	//설명을 추가해야 하므로 서브클래스에서 꼭 구현하도록 강제한다.
	public abstract String getDescription();
	//비용은 이미 추상메서드이므로 서브클래스에서 꼭 구현해야 한다.

}
