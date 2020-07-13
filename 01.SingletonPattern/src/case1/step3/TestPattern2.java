package case1.step3;

public class TestPattern2 {
	
	static int nNum = 0;

	public static void main(String[] args) {

		Runnable task = () -> { //thread 내용
			try {
				nNum++;
				Datebase database = Datebase.getInstance(nNum + "번째 Database");
				System.out.println("This is the "+database.getName());
			} catch (Exception e) {
				
			}
		};
		
		for (int i=0; i<10; i++) { //thread 10개 시작
			Thread t = new Thread(task); 
			t.start();
		}
		/* 실행결과 
		 * 
		 * 	This is the 2번째 Database
			This is the 2번째 Database
			This is the 2번째 Database
			This is the 2번째 Database
			This is the 2번째 Database
			This is the 2번째 Database
			This is the 2번째 Database
			This is the 2번째 Database
			This is the 2번째 Database
			This is the 2번째 Database
		   >>>1개가 생성됨
		  
		    순서는 메모리 여유대로 진행되기 때문에 꼭 1~10 차례로 되지는않는다.
		  (거의 동시에 시작됨 -> 그래서 각각의 singleton이 null이라고 인식)
		  */
	}
}
