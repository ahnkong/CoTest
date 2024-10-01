package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
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
		
		 
		int answer = 0; //0으로 시작하면, 곱이 다 0이 되기 때문에 1로
		
		Map<String, Integer> hashMap = new HashMap<>();
		for(int i = 0; i < clothes.length; i++) {
			String category  = clothes[i][1];
			System.out.println(i +"번째 Category: " + category); // 카테고리 출력
		       // 이미 해당 종류가 있다면 +1, 없다면 새로 추가
            hashMap.put(category, hashMap.getOrDefault(category, 0) + 1);
        }
		System.out.println("현재 담겨있는 것 " + hashMap);
		
		System.out.println();
		
        // HashMap의 value 값들만 가져오기
        Collection<Integer> values = hashMap.values(); // 모든 value를 가져옴
        
        // value 리스트로 변환
        List<Integer> valueList = new ArrayList<>(values);
        System.out.println("valueList는 : " + valueList);
        
        
        int temp1 = 0;
        int onlyOne = 0;
        int mix = 1; // 0으로 곱해버리니까 자꾸 0이 나와버림..그래서 1로 수정!
        // 첫 번째 값과 두 번째 값을 곱함
        for (int i = 0; i < valueList.size(); i++) {
        	
        	temp1 = valueList.get(i);
        	System.out.println("i번째: " + valueList.get(i));
        	onlyOne += temp1;
        	mix *= temp1;
        	System.out.println("한개씩만 입었을때 : " + onlyOne + "  |    섞어 입었을 때 : " + mix);
        }
        answer = onlyOne + mix;
        System.out.println(" [ 총 누적 경우의 수 ] " + answer );
		System.out.println(answer);
	}
}
		
