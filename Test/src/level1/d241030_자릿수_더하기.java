package level1;

public class d241030_자릿수_더하기 {
	public static void main(String[] args) {
		int n = 123;
		int answer = 0;
		//int -> String -> charAt -> Integer.parseInt(String.valueOf(());
		
		
		//정수형 -> 문자열로 만들기
		String strN = n + "";
//		String strN = Integer.toString(n);
		System.out.println(strN);
		int temp = 0;
		
		for (int i = 0; i < strN.length(); i++) {
			System.out.println(i+ "번째 " + strN.charAt(i));
			temp = Integer.parseInt(String.valueOf(strN.charAt(i)));
			answer += temp;
		}
		
		
		System.out.println(answer);
	}
}

		