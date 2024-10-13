package level1;


// 결국 아스키 코드 문제 
public class d241011_시저암호 {
	public static void main(String[] args) {
		
		//테스트 코드1
//		String s = "AB";
//		int n = 1;

		
		// 테스트 코드2
		String s = "a B z";
		int n = 4;
		
		
        String answer = "";  // 결과를 저장할 변수
        
        System.out.println("원래 문자열 : " + s);
        System.out.println();
        
        
        for (int i = 0; i < s.length(); i++) {
			
        	//원래의 문자를 담고, 그 다음에 if 문을 통해 조건 적용
        	char ch = s.charAt(i);
        	System.out.println(i + "번째 : " + s.charAt(i) );
        	
        	if (ch >= 'A' && ch <= 'Z') {
        		ch += n; // n만큼 더해주기!
        		if(ch >= 'Z') {
        			ch -= 26; // Z이상일때는 다시 A로 리셋
        		}
        	}
        	
        	if (ch >= 'a' && ch <= 'z') {
        		ch += n ;
        		if(ch >= 'z') {
        			ch -= 26; // Z이상일때는 다시 A로 리셋
        		}
        	}
        	//공백은 알파벳이 아니기때문에, 조건문에 들어가지 못해서 그대로 추가가됨.
        	answer += ch;
        	System.out.println(" 원래 문자 : " + s.charAt(i) + " => 누적 문자 : " + answer);
        	
        }	
        
        
    	System.out.println(answer);
        	
	}	
}    
