package case2.step3;

public class TestPattern {

	public static void main(String[] args) {
		
		//데이터베이스를 전략적으로 선택하여 사용한다.
		DatabaseUse myDb = new DatabaseUse();
		myDb.connect();
		
		//A(DatabaseUse)에게 같은 일을 시켰지만 동작은 B(MySQL)가 한다.
		myDb.setDatabase(new MySQL());
		myDb.connect();
		myDb.select();
		//A(DatabaseUse)에게 같은 일을 시켰지만 동작은 B(Informix)가 한다.
		myDb.setDatabase(new Informix());
		myDb.connect();
		myDb.select();
		//추가된 클래스
		//기존 코드의 수정 없이 오라클 접속 기능을 추가할 수 있다.
		myDb.setDatabase(new Oracle());
		myDb.connect();
		myDb.select();

	}

}
