package case1.use;

import case1.base.IceCream;
import case1.base.IceCreamCake;
import case1.base.IceCreamCone;
import case1.base.IcePop;
import case1.decorator.Melon;
import case1.decorator.StrawBerry;

public class Testpattern {

	public static void main(String[] args) {
		
		IceCream iceCream1 = new IceCreamCone();
		System.out.println(iceCream1.getDescription() + " 가격 :" + iceCream1.price());
		
		//아래와 같은 식으로 기본에 첨가물들을 Wrapping해서 가격과 설명을 추가할 수 있다.
		IceCream iceCream2 = new IceCreamCake();
		iceCream2 = new StrawBerry(iceCream2);
		System.out.println(iceCream2.getDescription() + " 가격 :" + iceCream2.price());
		
		IceCream iceCream3 = new Melon(new StrawBerry(new IcePop()));
		System.out.println(iceCream3.getDescription() + " 가격 :" + iceCream3.price());

	}

}
