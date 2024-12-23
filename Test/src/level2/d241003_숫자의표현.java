package level2;


public class d241003_숫자의표현 {
	public static void main(String[] args) {
		int answer = 0;
		int n = 15;
		int sum = 0;
		int cnt = 0; 
		
		
		
		//이거를 담아줄 변수하나를 만들어서 i+1씩 했을때의 누적합이 15가 되면  cnt를 하나 더해줄거야!
//		for (int i = 1; i <= n; i++) {
//			sum = 0; // 0으로 초기값 세팅
//			
//			for (int j = i; j <= n; j++) { //j를 sum에 누적합
//				sum += j;
//				
//				if(sum == n) {  // sum이 15랑 같으면, cnt++하고 이후에 탐색안해도 되니까 break해서 다음 숫자 재탐색 하도록
//					cnt++;
//					break;
//					
//				}else if(sum > n) {
//					break;
//				}
//			}
//		}
//		System.out.println("답: " + cnt);
//	}
//}

		
//투포인터로 풀어보자
//투 포인터 사이값이 목표값보다 크면, 왼쪽 포인터를 한칸 오른쪽으로 이동, 
// 만약 포인터 사이값의 합이 목표값보다 작으면, 오른쪽 포인터를 한칸 이동!
		
		int left = 0;
		int right = 0;
		//for (초기화; 조건식; 반복 후 실행식) { ... }
		for ( left = 1, right = 1, sum = 1; left <= n/2+1;) {
			//투포인터 제어
			if( sum < n) {
				right++;
				sum += right;
			} else if ( sum > n) {
				sum -= left;
				left++;
			} else {
				System.out.println("연속된 자연수 구간: " + left + " ~ " + right);
				cnt++;
				sum -= left; // left거 뺴고,
				left++; // 포인터 이동
			}
		}
		answer = cnt + 1;
		System.out.println("조건 만족 : " + answer);
	}	
}	
