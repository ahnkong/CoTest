package level1;

public class d240914_핸드폰번호가리기 {
	public static void main(String[] args) {
		
		String phone_number	= "01033334444";
		String answer = "";
		int temp = 0;
		
		// 배열의 길이만큼 돌리고,
		// 배열길이의 -5만큼은 출력
		// 그 전까지는 *로 출력
		
		for(int i = 0; i < phone_number.length() ; i++) {
			if(i< phone_number.length()-4) {
				temp = phone_number.charAt(i);
				answer += "*";
				System.out.println(answer);
			}else {
				answer += phone_number.charAt(i);
				System.out.println(answer);

			}
		}
		System.out.println(answer);
	}
}
