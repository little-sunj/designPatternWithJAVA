package case1.decorator;

import case1.base.IceCream;

public class StrawBerry extends Decorator {
	//strawberry는 decorator기 때문에 Decorator를 상속
	
	//wrapping하고자 하는 음료를 저장하기 위한 인스턴스 변수
	IceCream iceCream;
	
	public StrawBerry(IceCream iceCream) {
		this.iceCream = iceCream;
	}

	@Override
	public String getDescription() {
		return iceCream.getDescription() + " + 딸기";
	}
	
	@Override
	public int price() {
		return 500 + iceCream.price();
	}

	

}
