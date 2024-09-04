package level1;

/*
 *문자열 s의 길이가 4 혹은 6이고, 숫자로만 구성돼있는지 확인해주는 함수, solution을 완성하세요. 
예를 들어 s가 "a234"이면 False를 리턴하고 "1234"라면 True를 리턴하면 됩니다.

제한 사항
s는 길이 1 이상, 길이 8 이하인 문자열입니다.
s는 영문 알파벳 대소문자 또는 0부터 9까지 숫자로 이루어져 있습니다.
*/

public class 문자열다루기기본 {

	public static void main(String[] args) {
		
		/**안코코
		 * 여러 조건들의 결합
		 * 
		 * 핵심 :
		 * 
		 * 1) 문자열이 4이거나 6일때 
		 * 2) 형변환
		 * */
		String s = "a12445";
		
		int temp = 0; //임의의 변수
		boolean res = true; //결과값
		
//		//아스키코드 알아내는 과정
//		char ch = ' ';
//		//문자-> 숫자
//		char ch = 'z';
//		int asci = (int)ch;
//		System.out.println(asci);
//		
//		//숫자->문자
//		int asciNum = 78;
//		char chch = (char)asciNum;
//		System.out.println
//		(chch);

		if(s.length() == 4 || s.length() ==  6) {
			for(int i = 0 ; i < s.length() ; i++) {
				// charAt(0) 인덱스는 0부터 시작!이기때문에, < 이것만
				temp = (int)s.charAt(i);
				
				if(temp < 65) { //65는 대문자 A  
					res = true;
				} else {
					res = false;
					break;
				}
			}//for문
		} else {
			res = false;
		}
		System.out.println(res);
	}//메인
}//클래스	
