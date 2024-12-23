package practiceCode;

import java.util.HashMap;
import java.util.Iterator;

public class hash연습 {
	public static void main(String[] args) {
		/*
		1. HashMap에 데이터를 추가할 때는 put 메서드를 사용합니다. 
		이는 특정 키에 값을 추가하거나, 이미 해당 키가 존재하면 값을 업데이트합니다.
		*/
		
//		
//		//hashMAp의 선언(String:Integer)
//		
//		 HashMap<String, Integer> map = new HashMap<>();
//		 
//		 //값 추가(키 : "apple", 값 : 1)
//		 map.put("apple", 1);
//
//		 //값 추가(키 : "banana", 값 : 2)
//		 map.put("banana", 2);
//		 
//		 //값 업데이트 (키가 존재하면 새로운 값으로 대체)
//		 map.put("apple", 3);
//		 
//		 System.out.println(map);
		
		
		/*
		 2. HashMap에서 값 가져오기 (get 메서드 사용)
			HashMap에서 특정 키에 대응하는 값을 가져오려면 get 메서드를 사용합니다. 
			키가 존재하지 않으면 null을 반환합니다. 
		 */
		
		HashMap<String, Integer> hash = new HashMap<>();
		
		hash.put("apple", 1);
		hash.put("banana", 2);
		
		//값가져오기
		hash.get("apple"); // apple 키의 값가져와!
		System.out.println(hash.get("apple"));
		int appleValue = hash.get("apple");
		
//		for (int i = 0; i < hash.size(); i++) {
//			int temp = hash.get(hash);
//			System.out.println(i + "일때 : " + temp );
//		}
		
		/*
		 3. Key가 존재하지 않을 때 기본값 설정 (getOrDefault 메서드 사용)
			키가 존재하지 않을 경우 기본값을 반환하려면 getOrDefault 메서드를 사용할 수 있습니다.
			
			문제는 map.getOrDefault(runners, 0)을 사용하고 있지만, 
			그 결과를 맵에 다시 넣지 않기 때문입니다. 
			getOrDefault는 값을 반환만 할 뿐, 해당 키가 존재하지 않으면 값을 추가하지 않습니다. 
			그래서 map.get(runners)로 바로 값을 가져오면 null을 반환하는 상황이 발생하는 것입니다.
		 */
		
		int orangeValue = hash.getOrDefault("orange", 0); 
								// 키에 오랜지가 없으면  기본값 0을 반환해줘
		System.out.println("오랜지 밸류값 : " + orangeValue);
		
	}
}



//해시맵 키:밸류로 접근하는 문제들이 코딩테스트에 자주 등장하는 것 같다
// 관련 메서드들 다시 한번 정리해봐야겠다.