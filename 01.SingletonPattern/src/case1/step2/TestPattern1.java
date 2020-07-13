package case1.step2;

public class TestPattern1 {

	public static void main(String[] args) {
		
		/*
		 * Datebase d1 = new Datebase("1"); 
		 * Datebase d2 = new Datebase("2"); 
		 * Datebase d3 = new Datebase("3"); 
		 * Datebase d4 = new Datebase("4"); 
		 * Datebase d5 = new Datebase("5"); 
		 * Datebase d6 = new Datebase("6");
		 * 
		 * 위 처럼 생성시 Database X 6만큼의 리소스 차지
		 * 이를 막기위해 Database.java내 생성자를 private으로 선언
		 * 
		 */
		
		Datebase database;
		database = Datebase.getInstance("첫 번째 Database");
		System.out.println("This is the "+database.getName());
		
		database = Datebase.getInstance("두 번째 Database");
		System.out.println("This is the "+database.getName());
		
		System.out.println("database use");
		
		/* 결과값 -->
		 * This is the 첫 번째 Database
		 * This is the 첫 번째 Database
		 * 
		 * 두번째 getInstance시 기존에 생성된 값이 있으므로..
		 * */

	}

}
