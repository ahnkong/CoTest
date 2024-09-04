package level1;

/*
문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
각 단어는 하나 이상의 [공백]문자로 구분되어 있습니다.
각 단어의 [짝수번째 알파벳]은 [대문자]로, [홀수번째 알파벳]은 [소문자]로 바꾼 문자열을 리턴하는 함수 solution을 완성하세요.

<제한 사항>
문자열 전체의 짝/홀수 인덱스가 아니라, 
[단어(공백을 기준)별로 짝/홀수 인덱스를 판단]해야합니다.
[첫 번째 글자는 0번째 인덱스]로 보아 짝수번째 알파벳으로 처리해야 합니다.

<입출력 예>
		s			|		return
"try hello world"	|	"TrY HeLlO WoRlD"
						<012 01234 01234>
						 짝홀짝
					
<입출력 예 설명>

"try hello world"는 세 단어 "try", "hello", "world"로 구성되어 있습니다. 
각 단어의 짝수번째 문자를 대문자로, 홀수번째 문자를 소문자로 바꾸면 "TrY", "HeLlO", "WoRlD"입니다. 
따라서 "TrY HeLlO WoRlD" 를 리턴합니다.

*/
public class 이상한문자만들기 {
	public static void main(String[] args) {
		
		// 문자열 String의 각 요소를 charAt(i)를 분류하여 조건 탐색하는 문제
		// 핵심 : 문자열 자르기와, 조건에 따른 index의 처리
		
		// 1) 문자열의 각 요소 비교
		// 2) 공백과, 문자일때를 비교하여,  index를 처리!
		// 		ㄴ 공백을 만났을때, index초기화(다음 단어의 0번째 요소를 탐색할 수 잇게)
		// 		ㄴ 문자를 만났을때, 짝홀의 경우를 따져서 변환후 index++ 
		// 3) 각 단어의 요소들을 홀짝을 조건문으로 구분하여, toUpperClass, tLC써서 변환
		
		String s = "try hello world"; //문자열
        String res = ""; // 결과값
	    int index = 0; // 문자열이 홀짝인지 판별하기 위한 int변수
	
        for( int i = 0; i <s.length() ; i++){
	        char ch = s.charAt(i);
	        //공백일 경우 : 문자열에 그대로 추가, 그 후 인덱스 초기화 해서, 다음 단어 인덱스 탐색
    		if ( ch  == ' '){
	        	res += ch;
//	        	System.out.println("index: " + index + " res: " + res);
		        index = 0; //res에 추가한후 index를 0으로 초기화
        	} else {
		    //홀짝 판별
	               if (index % 2 == 0) {
	            	   res += Character.toUpperCase(ch);
	               } else {
	            	   res += Character.toLowerCase(ch);
	               }
            index++; // 인덱스 
	        }	
        }
        System.out.println(res);
    }
}