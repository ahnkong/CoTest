package level1;


// 결국 아스키 코드 문제 
public class d241011_시저암호 {
	public static void main(String[] args) {
		
		
		String s = "AB";
		int n = 1;
		
		char str = 0;
		
		String answer = "";

		System.out.println((int)str);
				
		for (int i = 0; i < s.length(); i++) {
			str += (char)s.charAt(i)+n;
			System.out.println(i+"번째 "+str+ " ");
			
		}
	}
}
