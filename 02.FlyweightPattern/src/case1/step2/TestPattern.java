package case1.step2;

public class TestPattern {

	public static void main(String[] args) {
		MyData md1 = new MyData();
		md1.xpos = 10;
		md1.ypos = 11;
		md1.name = "홍길동";
		
		MyData md2 = new MyData();
		md2 = md1; //md1과 md2의 id값이 같아짐 (같은값 참조)
		
		MyData md3 = new MyData();
		md3.xpos = 20;
		md3.ypos = 21;
		md3.name = "손오공";
		
		md2.name = "전우치"; //md2가 변하면서 공유하고잇는 md1도 변화하게 된다.
		md2.xpos = 5;
	}

}
class MyData {
	int xpos;
	int ypos;
	String name;
	
}