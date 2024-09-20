package algorithm;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class d240919_해시_전화번호목록 {
// 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 
//그렇지 않으면 true를 return 하도록 solution 함수를 작성
// 왜 안될까..?	
	
	public static void main(String[] args) {
		
//		String[] phone_book = {"119", "97674223", "1195524421"}; // 119-1195524421 => false
		String[] phone_book = {"11", "1", "22", "221", "234", "3945" }; //=> false
//		String[] phone_book = {"123","456","789" }; //=> true
//		String[] phone_book = {"123", "2345", "23467"}; //=> false => 반례

		boolean answer = true;
		boolean flag = true; // flag 변수
//		
		
//		1)문제에 대한 이해가 잘못 됐었다! - 인덱스 0이 접두어라고 판단하고, 0-1 | 0-2 이렇게만 탐색함.
//								  - 그러나 1-2 이렇게 될수도 잇는 거였음. 다른 접근이 필요했음.=> 전체 탐색으로 접근해봐야함.
//		Arrays.sort(phone_book);
//		Stack<String> stackStr = new Stack<>();
//		System.out.println(Arrays.toString(phone_book));
//		
////		System.out.println();
//		stackStr.push(phone_book[0]);
//		
////		System.out.println(stackStr.peek());
//		
//		for (int i = 1; i < phone_book.length; i++) {
//			if(phone_book[i].startsWith(stackStr.peek())) {
//				answer = false;
//				System.out.println("i는 : " + i + " answer는 : " +  answer);
//				break;
//				
//			}else {
//				answer = true;
////				System.out.println(answer);
//			}
//		}
//		System.out.println(answer);

		
		// 전체 탐색
		System.out.println(Arrays.toString(phone_book));
		

		for (int i = 0; i < phone_book.length-1; i++) {
			for (int j = i+1; j < phone_book.length; j++) {
				if(phone_book[j].startsWith(phone_book[i])) {
					answer = false;
					flag = false;
					System.out.println(i + "번째와" +j+ "번째의 탐색의 결과 : " + answer );
					break;
				} else {
					System.out.println(i + "번째와" +j+ "번째의 탐색의 결과 : " + answer );
				}
			}
			if(flag != true) {
				break;
			}
		}
		System.out.println(answer);

		
		
		
		
		//3)스택이 아닌 전체 탐색으로 먼저 다시 풀어보자 => 그랬는데, 이게 답이고
//		Arrays.sort(phone_book);
//		System.out.println(Arrays.toString(phone_book));
//		
//		for (int i = 0; i < phone_book.length; i++) {
//			if(phone_book[i+1].startsWith(phone_book[i])) {
//				answer = false;
//				System.out.println(i + "번째와" +(i+1)+ "의 탐색의 결과 : " + answer );
//				break;
//			} else {
//				answer = true;
//				System.out.println(i + "번째와" +(i+1)+ "의 탐색의 결과 : " + answer );
//			}
//		}
//		System.out.println(answer);
	}
}
