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
		
		
			//while로 해보자!
			int i = 0;
			int j = 0;
			while(j*j <= i) {
				if(i%j == 0 ) {
					divCount++;
					if( j != i/j ) {
						divCount++;
					}
				}
				j++;
			}
			
			
			System.out.println(divCount);
			
//			System.out.println("   숫자 " + i + "에 대한 약수의 갯수 : " + divCount);
			System.out.println();
			if(divCount <= limit){
				answer += divCount;
			} else {
				answer += power;
			}			
			
			System.out.println(answer);
		}
		
	}
// 답은 10이 나와야함



//	for (int j = 1; j <= i; j++) {
//		temp = i%j;
//		System.out.println("   j는 " + j +" temp는 " +temp);
//		if(temp == 0 ) {
//			temp2++;
//		}
//		sord[i-1] = temp2;
//		System.out.println("     " + Arrays.toString(sord));
//		System.out.println();
//	}
//	}
//	System.out.println(Arrays.toString(sord));
//	
//	for(int attack : sord) {
//	if(attack <= limit ) {
//		answer += attack;
//	} else {
//		answer += power;
//	}
//	}
//	
//	System.out.println(answer);
//	
//	}
//}
//답은 10이 나와야함
