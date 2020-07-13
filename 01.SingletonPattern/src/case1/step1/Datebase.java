package case1.step1;

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

	public static Datebase getInstance(String name) {
		if (singleton == null) {
			singleton = new Datebase(name);
		}
		return singleton;
	}
	public String getName() {
		return name;
	}
	
}
