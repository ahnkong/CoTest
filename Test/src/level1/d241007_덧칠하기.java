package level1;

import java.util.Arrays;

public class d241007_덧칠하기 {
	public static void main(String[] args) {
		
		
		int n = 8;
		int m = 4;
		int[] section = {2, 3, 6};
		
		int answer = 0;
		int[] temp = new int[n];
		for (int i = 0; i < n; i++) {
			temp[i] = i+1;
			System.out.println(Arrays.toString(temp));
		}
		
		System.out.println("칠해야 하는 영역 " + Arrays.toString(section));
		System.out.println("롤러의 길이 : " + m);
	
	}
}
