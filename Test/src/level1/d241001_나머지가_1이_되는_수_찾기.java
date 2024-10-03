package level1;

public class d241001_나머지가_1이_되는_수_찾기 {
	public static void main(String[] args) {
		
		int answer = 0;
		int n = 10;
		
		//레이블 사용!
		numberOne:
		for (int i = 1; i <= n; i++) {
			if( n % i == 1) {
				System.out.println(i+ "번째");
				answer = i;
				break numberOne;
			}
		}
		System.out.println(answer);
		
		
		
		//삼항연산자 사용!
		for (int i = 1; i <= n; i++) {
			answer = (n % i == 1) ? i : 0;
		}
//		System.out.println(answer);
	}
}
