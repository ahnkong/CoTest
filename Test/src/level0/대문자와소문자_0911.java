package level0;

public class 대문자와소문자_0911 {
	public static void main(String[] args) {
		String answer = "";
		String my_string = "accCCC";
		String asciTest = "azcAZC";
		//대문자에!
//		System.out.println(my_string.toUpperCase());
		
		for(int i = 0; i < my_string.length() ; i++) {
			char nowChar = my_string.charAt(i);
				
				
			System.out.println(i + "번째 : " + nowChar);
			if(Character.isUpperCase(nowChar)){ //isUpperCase : 은 대문자라면
				answer += Character.toLowerCase(nowChar);//toLowerCase : 소문자로~
				System.out.println(answer);
			}else {
				answer += Character.toUpperCase(nowChar);
				System.out.println(answer);

			}
			
		}
		
		System.out.println(answer);
	}
}

// 아스키 코드랑, 내장 객체 함수를 통해 쉽게 접근할 수도 있다!