package case2;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static Map<String, Subject> map = new HashMap<String, Subject>();
	
	//java.lang.String에 적용된 방식과 동일한 방식이다.
	//key값이 맵에 없으면 추가하고 있으면 재사용한다.
	public Subject getSubject(String key) {
		Subject subject = map.get(key);
		if (subject == null) {
			subject = new Subject(key);
			map.put(key, subject);
			
			System.out.println("새로 생성  :" +key);
		}else {
			System.out.println("재사용 :" +key);
		}
		return subject;
	}
}
