package gabia;

import java.util.Arrays;
import java.util.Iterator;

public class egg {
	public static void main(String[] args) {

		int N = 5;
		int[] E = { 1, 1, 1, 5, 5 };
		int D = 60;
		
		
		int add = 0 ;
		int cycle =1;
		
		int[] answer = new int[2];
		int chick = 0;
		System.out.println(Arrays.toString(E));
//		Arrays.sort(E);
		for (int i = 0; i < E.length; i++) {
			System.out.println((i+1) + "차 성장");
			E[i] = E[i] + D;
			System.out.println(Arrays.toString(E));
		}
		
		for (int j = 0; j < E.length; j++) {
			if (E[j] >= 14*cycle) {
			chick++; 
			System.out.println("부화한 병아리 : " + chick);
			}
		}
		
			//병아리계산
			if (chick % 2 == 0) {
				add = chick / 2;
				answer[0] += add;
				answer[1]+= add;
			} else {
				add = chick / 2;
				answer[0] += add + 1;
				answer[1] += add;
			}
			

		System.out.println(Arrays.toString(answer));
	}
}
