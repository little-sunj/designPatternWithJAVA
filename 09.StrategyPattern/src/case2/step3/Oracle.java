package case2.step3;

public class Oracle extends Database{
	
	public Oracle() {
		name = "Oracle";
		rows = 50;
	}
	@Override
	public void connectDatabase() {
		System.out.println(name + "**** 접속했습니다.");
		
	}

}
