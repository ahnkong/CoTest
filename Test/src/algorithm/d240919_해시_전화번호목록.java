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
		String[] phone_book = {"11", "1", "22", "221" }; //=> true
		
		boolean answer = true;
		
//		Arrays.sort(phone_book);
		Stack<String> stackStr = new Stack<>();
		System.out.println(Arrays.toString(phone_book));
		
//		for(String phone : phone_book) {
//			System.out.print(phone + " ");
//		}
		
		System.out.println();
		stackStr.push(phone_book[0]);
		
		System.out.println(stackStr.peek());
		
		for (int i = 1; i < phone_book.length; i++) {
			if(phone_book[i].startsWith(stackStr.peek())) {
				answer = false;
				System.out.println("i는 : " + i + " answer는 : " +  answer);
				break;
				
			}else {
//				System.out.println(answer);
			}
		}
		System.out.println(answer);
		
	}
}
