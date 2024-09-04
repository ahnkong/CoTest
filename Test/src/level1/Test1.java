package level1;
//짝수는 싫어 
import java.util.Arrays;

public class Test1 {
	public static void main(String[] args) {
		
		int n = 15;
		int[] answer = new int[(n + 1) / 2];
		// 배열의 갯수를 선언할때, 홀수니까 n의 반만 배열을 선언해주는것!

		for (int i = 1; i <= n; i++) {
			if (i % 2 == 1) {
				answer[i / 2] = i;
			}
		}
		System.out.println(Arrays.toString(answer));
		//toString으로 뽑아줘야하는구나.. toString
	}	
}
