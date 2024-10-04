package level1;

import java.util.HashMap;
import java.util.Iterator;

public class d241005_hash_완주하지못한선수 {
	public static void main(String[] args) {
		String[] participant = {"leo", "kiki", "eden"};
		String[] completion = {"eden", "kiki"};
		
		//키 : 밸류로 완주 여부에 대해서 관리
		//참가=> 0 , 완주 o => 1로
		// 마지막에 key가 0인 값을 출력하게끔
		String answer = "";
		
		//키 = 선수  | 참가자 - 0으로 셋팅
		HashMap<String, Integer> map = new HashMap<>();
		
		//참가 선수 0밸류에 넣어주기!
		for(String runners : participant) {
//			int value = map.getOrDefault(runners, 0);
//			System.out.println("Key: " + runners + ", Value: " + value);		
			map.put(runners, map.getOrDefault(runners, 0));
		    System.out.println("[Key] " + runners + " [Value] " + map.get(runners));
		}
		System.out.println();
		
		for(String finish : completion) {
			map.put(finish, 1);
			System.out.println("[key] " + finish + "[Value] " + map.get(finish));
		}
		
	}
	
}
