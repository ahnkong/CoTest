package level0;

import java.util.Arrays;

public class d241030_x만큼간격이_있는_n개의_숫자 {
	public static void main(String[] args) {
		
		int x = 4;
		int n = 3;
		long[] answer = new long[n];
		
		for (int i = 0; i < n; i++) {
			answer[i] = (long)x*(i+1); // long으로 형변환해줘야하는게 핵심
		}
		System.out.println(Arrays.toString(answer));
	}
}
