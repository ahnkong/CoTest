package level2;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class d240921_스택큐_기능개발 {
	//스택큐로 생각해보기
	//이번엔 문제를 잘읽고 천천히 생각해보자 + 중간 중간 직관적으로 많이 찍어보자
 	public static void main(String[] args) {

 		
 		//1. progresses랑 speeds랑 곱한 값을 temp에 넣어주기
 		//케이스 1
 		int[] progresses = {95, 90, 99, 99, 80, 99};
 		int[] speeds = {1, 1, 1, 1, 1, 1};
 		
 		//케이스 2
// 		int[] progresses = {93, 30, 55};
// 		int[] speeds = {1,30,5};
 		
		int[] temp = new int[progresses.length];
		int[] day = new int[progresses.length];
		
 	   	int cnt = 1;
 	   	
 	   	for (int i = 0; i < progresses.length; i++) {
 	   		int complete = 100-progresses[i];
 	   		day[i] = complete/speeds[i];
 	   		
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
 	        int[] answer = new int[que.size()];
   	        int index = 0;
	 	      while (!que.isEmpty()) {
	 	          answer[index++] = que.poll();
	 	      }
 	        
 	        System.out.println(Arrays.toString(answer));
 	
		}
} 	   	
// 	   	Stack<Integer> stack = new Stack<>();
// 	   	System.out.println("반복문 다 돌고 나온 후 : " + que);
 	   	
// 	   	for (int i = 0; i < progresses.length; i++) {
//			int complete = 100-progresses[i];
//			day[i] = complete/speeds[i];
//			
//			System.out.println(i +"번째 : " + day[i] );
//		}
// 	   	System.out.println("완성되는 날짜 : " +Arrays.toString(day));
// 	   	System.out.println();
// 	   	
// 	   for (int i = 0; i < day.length; i++) {
// 		   for (int j = 1; j < day.length; j++) {
// 			   stack.push(day[i]);
// 			   cnt++;
//				if(stack.peek()>= day[j]) {
//					stack.push(day[j]);
//					cnt++;
//	
//	 	   			System.out.println("Stack : " + stack + " = 완성된 기능 : " + cnt + "개");
//	 	   			answer[i] = cnt;
//	 	   			stack.clear();
//	 	   			System.out.println("stack에 남아있는 값 " + stack);
//				}else {
//					stack.push(day[j]);
//				}
//				
// 		   }
// 		   System.out.println("stack : " + stack);
// 		   System.out.println("answer : " + Arrays.toString(answer));
//		}
//	}
//}
