package level2;

import java.util.Arrays;

public class d241103_최댓값과최솟값 {
	public static void main(String[] args) {
//		String s = "1 2 3 4";
		String s = "-1 -2 -3 -4";
		String answer ="";
		
		int num = 0;
		int max = Integer.MIN_VALUE; //초기화
		int min = Integer.MAX_VALUE;
		
		System.out.println(max);
		System.out.println(min);
		
		for( String numStr : s.split("\\s")) {
			num = Integer.parseInt(numStr);
			
			min = Math.min(min, num); //min의 값과 num의 값을 비교해서 더 작은 값을 min에 담아주기
			max = Math.max(max, num); //max의 값과 num의 값을 비교해서 더 큰 값을 max에 담아주기
		}
		
		answer = min + " " + max;
		System.out.println(answer);
	}
	

}
