package case1.step2;

public class Datebase {
	
	private static Datebase singleton;
	private String name;

	private Datebase(String name) {
		try {
			Thread.sleep(100);
			this.name = name;
		} catch (Exception e) {
			
		}
	}

	//synchronized 예약어를 추가하므로써, 동시에 여러 쓰레드가 접근하더라도
	//줄을 서서 앞 쓰레드가 끝나기를 기다리게 된다. (차례도록 진행하도록)
	// but 비용이 많이 들어간다. --> 쓰레드가 많을 경우 길어짐
	public synchronized static Datebase getInstance(String name) {
		if (singleton == null) {
			singleton = new Datebase(name);
		}
		return singleton;
	}
	public String getName() {
		return name;
	}
	
}
