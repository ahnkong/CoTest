package level1;

import java.util.Arrays;
import java.util.Collections;

public class d240915_제일작은수제거하기 {
	public static void main(String[] args) {
		Integer[] arr = {4,3,2,1};
		int[] answer = new int[arr.length];
		//이걸 암기! 꼭 암기! 꼮꼮! 암기!
		Arrays.sort(arr,Collections.reverseOrder());

//		for(int i : arr ) {
//			System.out.print(i+ " ");
//		}
		
		
		for (int i = 0; i < arr.length-1; i++) {
			answer[i] = arr[i];
			System.out.println("검증 " + i+"번째 : " + Arrays.toString(answer)); // 왜 4번 돌아?
			
		}
		//빈배열일 경우 -1;
		// 가장 작은 수, 배열 제거 하고!
		for (int i = 0; i < arr.length; i++) {
			
			if(answer.length == 0 ) {
				int temp = -1;
				answer[0] += temp;
				System.out.println(Arrays.toString(answer));
//				return answer;
			}
		}
		
		
		
	}
}
