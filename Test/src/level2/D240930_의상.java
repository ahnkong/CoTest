package level2;

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
//		String[][] clothes = {{"yellow_hat", "headgear"}, {"blue_sunglasses", "eyewear"}, {"green_turban", "headgear"}};
		String[][] clothes = {{"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeup", "face"}};
		
		int answer = 0;
		
		Map<String, Integer> hm = new HashMap<>();
		for(int i = 0; i < clothes.length; i++) {
			String key = clothes[i][1];
		}
		
	}
		
}
