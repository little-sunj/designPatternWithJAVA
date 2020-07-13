package case1.step3;

public class Datebase {
	
	private static Datebase singleton = new Datebase("products");
	//static이기 때문에 프로그램 실행시 객체가 만들어진다. '이미' 생성된 상태가 된다.
	//아래 getInstance에서 null여부를 확인할 필요가 없어진다. (이미 있으므로)
	private String name;

	private Datebase(String name) {
		try {
			Thread.sleep(100);
			this.name = name;
		} catch (Exception e) {
			
		}
	}

	public static Datebase getInstance(String name) {
		return singleton;
	}
	public String getName() {
		return name;
	}
	
}
