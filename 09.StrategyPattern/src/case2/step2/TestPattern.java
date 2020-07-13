package case2.step2;

public class TestPattern {

	public static void main(String[] args) {
		
		DatabaseUse myDb = new DatabaseUse();
		
		//데이터베이스세팅
		myDb.connect(DBTYPE.MySQL);
		myDb.select();
		
		//데이터베이스세팅
		myDb.connect(DBTYPE.Informix);
		myDb.select();

	}

}
