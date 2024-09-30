package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class D240930_의상 {
/*
 * 
 * 
	종류		이름
	얼굴		동그란 안경, 검정 선글라스
	상의		파란색 티셔츠
	하의		청바지
	겉옷		긴 코트
 * clothes의 각 행은 [의상의 이름, 의상의 종류]로 이루어져 있습니다.
 * 
 * */	
	public static void main(String[] args) {
		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
//		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		 
//		int answer = 0;
		int answer = 1; //0으로 시작하면, 곱이 다 0이 되기 때문에 1로
		
		Map<String, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < clothes.length; i++) {
			String category  = clothes[i][1];
			System.out.println(i +"번째 Category: " + category); // 카테고리 출력
		       // 이미 해당 종류가 있다면 +1, 없다면 새로 추가
            hashMap.put(category, hashMap.getOrDefault(category, 0) + 1);
        }
		System.out.println("현재 담겨있는 것 " + hashMap);
		
		System.out.println();
		
        // 서로 다른 의상 종류를 선택할 수 있는 경우의 수 계산
		// 옷은 입을 수도 있고, 안입을수도 있기 때문에, values
		for (int count : hashMap.values()) {
			
		    System.out.println("category count: " + count);
		    
		    answer *= (count + 1); // 해당 종류를 입지 않는 경우 포함
		    
		    System.out.println("경우의 수, answer = " + answer);
		    System.out.println();
		}
        
        // 아무것도 입지 않는 경우를 빼주는거!!!!
        answer = answer -1 ;
		
		System.out.println(answer);
	}
}
		
