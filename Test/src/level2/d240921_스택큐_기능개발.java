package level2;

import java.util.Arrays;
import java.util.Stack;

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
 		
		int[] temp = new int[progresses.length];
		int[] day = new int[progresses.length];
		
 	   	int[] answer = new int[progresses.length];
 	   	int cnt = 0;
 	   	
 	   	Stack<Integer> stack = new Stack<>();
 	   	
 	   	for (int i = 0; i < progresses.length; i++) {
			int complete = 100-progresses[i];
			day[i] = complete/speeds[i];
			
			System.out.println(i +"번째 : " + day[i] );
		}
 	   	System.out.println("완성되는 날짜 : " +Arrays.toString(day));
 	   	
 	   for (int i = 1; i < day.length; i++) {
 		   stack.push(day[0]);
 		   cnt++;
 		   for (int j = 0; j < answer.length; j++) {
			
				if(stack.peek()>= day[i]) {
					stack.push(day[i]);
					cnt++;
	 	   			System.out.println("Stack : " + stack + "완성된 기능 : " + cnt + "개");
	 	   			answer[i-1] = cnt;
	 	   			System.out.println("잘담기고 있나 확인 : " + Arrays.toString(answer));
	 	   			stack.clear();
	
	 	   			System.out.println("stack에 남아있는 값 " + stack);
				} 
 		   }
		}
	}
}
