package level1;

public class d241028_기사단원의무기 {
	public static void main(String[] args) {
		
		
		// 테스트 코드 1
//		int number = 5;
//		int limit = 3;
//		int power = 2;
		// 테스트 코드2
		int number = 10;
		int limit = 3;
		int power = 2;
		
		
		int answer = 0;
		int divCount = 0;
		
		
//		for (int i = 1; i <= number; i++) {
//			divCount = 0;
//            
//           for (int j = 1; j * j <= i; j++) {
//                if (i % j == 0) {
//                    divCount++; // j는 약수
//                    if (j != i / j) { // 서로 다른 두 약수 j와 i/j
//                        divCount++;
//				}	
//			}	
//           }
//           
		
			for (int i = 1; i <= number; i++) {
				divCount = 0;
	            int j = 1;

            // 약수 구하기
	            while (j * j <= i) {
	                if (i % j == 0) {
	                    divCount++; // j는 약수
	                    if (j != i / j) { // 서로 다른 두 약수 j와 i/j
	                        divCount++;
	                    }
	                }
	                j++;
	            }

			if(divCount <= limit){
				answer += divCount;
			} else {
				answer += power;
			}			
			System.out.println("합계 : " + answer);
			}
	}
}	
//답은 10이 나와야함
