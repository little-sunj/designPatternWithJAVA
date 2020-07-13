package case2.step3;

public class DatabaseUse {
	
	//접근점
	private Database db;
	
	//데이터베이스 교환 가능하도록
	public void setDatabase(Database db) {
		this.db = db;
	}
	
	//기능 선택
	public void connect() {
		if (db == null) {
			System.out.println("데이터베이스를 먼저 선택하세요.");
		} else {
			//Function Delegate : 구체적인 데이터베이스의 종류는 몰라도 기능 사용 가능
			db.connectDatabase();
		}
	}
	
	public void select() {
		db.selectData();
	}
}
