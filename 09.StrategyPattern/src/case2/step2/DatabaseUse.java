package case2.step2;

enum DBTYPE {MySQL, Informix}

public class DatabaseUse {
	
	private Database db;
	
	//기능 선택
	public void connect(DBTYPE dbType) {
		switch(dbType) {
		case MySQL :
			db = new MySQL();
			break;
		case Informix :
			db = new Informix();
			break;
		}
		if (db == null) {
			System.out.println("데이터베이스를 먼저 선택하세요");
		} else {
			db.connectDatabase();
		}
	}
	
	public void select() {
		db.selectData();
	}
}
