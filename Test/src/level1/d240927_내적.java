package level1;

import java.util.Arrays;
import java.util.Iterator;

public class d240927_내적 {
/*
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다. a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

이때, a와 b의 내적은 a[0]*b[0] + a[1]*b[1] + ... + a[n-1]*b[n-1] 입니다. (n은 a, b의 길이
 
 * */
	public static void main(String[] args) {
		//케이스1
//		int[] a = {1,2,3,4};
//		int[] b = {-3,-1,0,2};
		//케이스2
		int[] a = {-1,0,1};
		int[] b = {1,0,-1};
		int answer = 0;
		int[] temp = new int[a.length];
		// 두 배열 요소의 접근 입니다.
		
//		Arrays.fill(temp, 7);
//		System.out.println("fill() 메서드" + Arrays.toString(temp));
//		System.out.println();
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = a[i] * b[i];
			System.out.println(i + "번째 : " +Arrays.toString(temp));
			answer = answer + temp[i];
			System.out.println("현재 answer : " + answer );
		}
		
		
		System.out.println(answer);
	}
	
}
