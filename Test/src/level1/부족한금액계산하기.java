package level1;

public class 부족한금액계산하기 {
	
	public static void main(String[] args) {
	
		int price = 3; 
		int money = 20;
		int count = 4;
		int sum = 0;
		
		
		long answer = 0;
		
		
		for ( int i = 0; i <= count ; i++ ) {
			sum = sum + price*i;
			
			answer = sum - money;

//			if (answer <= 0) {
//				answer = 0;
//				break;
//			} 	
//		}
			while (answer < 0) {
				answer = 0;
				break;
			} 	
		}
		
		// if로 걸었더니 0에서 바로 빠져나와서 바로 0이 되어버린다.
		// if 아닌 while로 했더니, 결과값인 10이 나오긴 하는데, 유효성 검사에서 걸려버려따.
		System.out.println(answer);
	
	}	
	
	
}
