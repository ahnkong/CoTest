package level1;

public class d240914_수박수박수 {
	public static void main(String[] args) {
		
		int n = 3;
		String answer ="";
		
		//홀수는 수 짝수는 박을 리턴
		
		for (int i = 1; i <= n; i++) {
			if( i % 2 == 0 ) {
				answer += "박";
				System.out.println("i는 " + i + "번째" + answer);
			} else {
				answer += "수";
			}
		}
		System.out.println(answer);
	}
}
