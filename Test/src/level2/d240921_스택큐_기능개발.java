package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class d240921_스택큐_기능개발 {
	//스택큐로 생각해보기
	//이번엔 문제를 잘읽고 천천히 생각해보자 + 중간 중간 직관적으로 많이 찍어보자
 	public static void main(String[] args) {

 		
 		//1. progresses랑 speeds랑 곱한 값을 temp에 넣어주기
 		//케이스 1
// 		int[] progresses = {95, 90, 99, 99, 80, 99};
// 		int[] speeds = {1, 1, 1, 1, 1, 1};
 		
 		//케이스 2
 		int[] progresses = {93, 30, 55};
 		int[] speeds = {1,30,5};

 		//케이스 3
// 		int[] progresses = {90, 90};
// 		int[] speeds = {10, 9};
 		
//		int[] temp = new int[progresses.length];
		int[] day = new int[progresses.length];
 	   	
 	   	for (int i = 0; i < progresses.length; i++) {
 	   		int complete = 100-progresses[i];
 	   		
 	   		//1)
	   		if(complete%speeds[i] != 0) {
 	   			day[i] = (complete/speeds[i])+1;
 	   		
 	   		}else{
                day[i] = (complete/speeds[i]);
            }  
 	   		//2)남은 일수를 올림하지 않고 계산 (정수 나눗셈 사용)
// 	   		day[i] = (complete + speeds[i] - 1) / speeds[i];
 	   	 	   		
 	   		System.out.println(i +"번째 : " + day[i] );
 	   	}
 	   	
 	   	System.out.println("배포가능날짜 : " + Arrays.toString(day));
 	   	System.out.println();
 	   	
 	   	
 	   	//큐 객체 생성
 	   	Queue<Integer> que = new LinkedList<>();
 	   	// push, peek, poll
 	   	
 	   	
 	   	// 조건을 넣어주면서, cnt를 큐에 담아줘야한다.
 	   	int firstDay = day[0];
 	   	int cnt = 1; //첫번째 배포 그룹에 포함될 기능 수!
 	   	
 	   	for (int i = 1; i < day.length; i++) {
 	   			if(day[i] <= firstDay) {
 	                
 	                cnt++;// 앞의 기능이 완료될 때 함께 배포할 수 있으면 카운트 증가
 	                System.out.println("cnt : " +cnt);
 	   				
 	   			} else {
 	                // 새 배포가 필요할 경우, 큐에 배포할 기능 수 추가
 	                que.add(cnt);
 	                System.out.println("현재까지 배포 : " + que);
 	                // 새로운 배포 그룹 시작
 	                firstDay = day[i];  // 새로운 기준 날짜
 	                cnt = 1;  // 새 배포 그룹의 첫 번째 기능
 	            }
 	        }
 	        
 	        // 마지막 남은 기능 배포
 	        que.add(cnt);
 	        System.out.println("최종 배포 : " + que);
 	        
 	        //결과를 배열로 반환
//   	        int index = 0;
//	 	      while (!que.isEmpty()) { // 비면 끝!
//	 	          answer[index++] = que.poll(); //인덱스를 하나씩 증가하면서, 큐에서 값을 하나씩 꺼내서 배열에 저장
//	 	      }
 	        
// 	        System.out.println(Arrays.toString(answer));
 	        System.out.println(que);
		}
} 	   	

