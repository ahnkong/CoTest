package level1;

import java.util.Arrays;

public class d241017_JadenCase_문자열_만들기 {
	public static void main(String[] args) {

		// 테스트 코드1
//		String s = "people unFollowed m0e";
		// 테스트 코드2
//		String s = "for the last week";
		// 테스트 코드3
		String s = "  for the what 1what  ";

		String answer = "";

//		String[] words = s.split(" ");// 공백기준으로 나누기
//		System.out.println(Arrays.toString(words));
		
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			
			// 첫 문자는 무조건 대문자로 변환
			if (i == 0 || s.charAt(i - 1) == ' ') {
				answer += Character.toUpperCase(c);
				
			} else {
				// 그 외는 소문자로 변환
				answer += Character.toLowerCase(c);
			}
		}
//		System.out.println("트림 전 : " + answer);
//		answer = answer.trim();
//		System.out.println("트림 후 : " + answer);
		System.out.println();
		
		System.out.println(answer);
	}
}
