package level1;

import java.util.Arrays;

/*
 * 전체 예산 정해져있음.
 * 최대한 많은 부서에게 물품을 구매해주려고 함.
 * 신청한 금액은 정확하게 주어야 함 => 오케
 * 
 * 
 * */
public class d240911_예산 {
	public static void main(String[] args) {
//		int[] d = { 1, 3, 2, 5, 4 };
//		int budget = 9;


		int[] d = {2,2,3,3};
		long budget = 10;

//		int[] d = {1,1,1,1,1};
//		long budget = 10;
		Arrays.sort(d);
		System.out.println(Arrays.toString(d));

		int answer = 0;
		int sum = 0;
		int cnt = 0;

		for (int i = 0; i < d.length; i++) {
			sum += d[i];
			if(sum > budget) {//이 상황이면 종료, 그전에는 계속 돌면서
				break;
			}
			cnt++;
			
			
		}
		System.out.println(cnt);
	}
}
