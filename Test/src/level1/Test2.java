package level1;

public class Test2 {
	public static void main(String[] args) {
	
		String rsp = "250";
		String answer = "";
		
		// 문자열을 2개를 만들어서 그게 나오면, ' ' 
		// 비교해서 그문자열이 나오면, answer에 추가!
		// 이게 합쳐지는건가? answer값들이 어떻게 합쳐지는거지?
		for (int i = 0; i < rsp.length(); i++) {
			if(rsp.charAt(i) == '2') {
				answer += '0'; 
				System.out.println(answer);
			}else if(rsp.charAt(i)=='0') {
				answer += '5';
				System.out.println(answer);
			}else if(rsp.charAt(i)=='5') {
				answer += '2';
				System.out.println(answer);
			} //문자열이 1개일때, 1번 - 2개일때 2번 - 3개 일때 3번!
			//그게 위에 선언해준answer 에 계속 붙는거!
			//0
			//02
			//025 이렇게 붙는구나! 어케이! 
		}
//		System.out.println(answer);
		
	}
}	
