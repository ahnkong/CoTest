package level1;


// 결국 아스키 코드 문제 
public class d241011_시저암호 {
	public static void main(String[] args) {
		
		
		String s = "AB";
		int n = 1;
		
		char str = 0;
		
		String answer = "";

		
				
		for (int i = 0; i < s.length(); i++) {
			str += s.charAt(i);
			System.out.println(i+"번째 "+(int)str+1+ " ");
			
		}
		System.out.println(str);
	}
}
