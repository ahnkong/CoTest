package level1;

import java.util.Arrays;
import java.util.Iterator;

public class d241007_덧칠하기 {
	public static void main(String[] args) {
		
		int n = 8; // 덧칠할 벽의 길이 
		int m = 4;  // 롤러의 길이
		int[] section = {2, 3, 6}; // 덧칠해줘야하는 영역
		
//		int n = 4; // 덧칠할 벽의 길이 
//		int m = 1;  // 롤러의 길이
//		int[] section = {1, 2, 3,4}; // 덧칠해줘야하는 영역
//		
	
		
//		int n = 5; // 덧칠할 벽의 길이 
//		int m = 4;  // 롤러의 길이
//		int[] section = {1,3}; // 덧칠해줘야하는 영역
//		
		int max = 0;
		int current = 0;
		
		
		int cnt= 0; // 덧칠 몇번 했는지 count해주는 거
		int answer = 0;
		System.out.println("칠해야 하는 영역 " + Arrays.toString(section));
		System.out.println("롤러의 길이 : " + m);

		
		System.out.println();
		
		
		//section[i]와 max의 비교
		//max를 기준으로 section[i]를 비교해서, max보다 section[i]의 값이 클 경우에만 cnt++ 1씩 증가!
		for (int i = 0 ; i < section.length; i++) {
			if(section[i]>max) { 
				cnt++;
				System.out.println(i + "번째임! 그리고 cnt는 " +cnt );
				max = section[i]+ m-1;  // section[0]+4-1 = 2+4-1 = 5가 max에 새롭게 저장
				System.out.println(" max는 : " + max);
			} 
		}		
		System.out.println(cnt);
	
	}
}
