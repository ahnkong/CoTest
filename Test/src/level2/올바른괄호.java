package level2;

import java.util.Stack;

public class 올바른괄호 {
	public static void main(String[] args) {
	       
		/*
		 * 문제 설명 괄호가 바르게 짝지어졌다는 것은 '(' 문자로 열렸으면 반드시 짝지어서 ')' 
		 * 문자로 닫혀야 한다는 뜻입니다. 
		 * 예를 들어
		 * "()()" 또는 "(())()" 는 올바른 괄호입니다. ")()(" 또는 "(()(" 는 올바르지 않은 괄호입니다. 
		 * '(' 또는 ')' 로만 이루어진 문자열 s가 주어졌을 때, 
		 * 문자열 s가 올바른 괄호이면 true를 return 하고, 
		 * 올바르지 않은 괄호이면 false를 return 하는 solution 함수를 완성해 주세요.
		 * 제한사항 문자열 s의 길이 : 100,000 이하의 자연수 문자열 s는 '(' 또는 ')' 로만 이루어져 있습니다. 입출력 예 s
		 * answer 
		 * 	"()()" 	true 
		 * 	"(())()" true 
		 * 	")()(" 	false 
		 * 	"(()(" 	false 
		 *  * */
		
		boolean answer = true;
		
		String s = "(())";
		
		//스택을 통해 해결할 수 있는 문제
		Stack<Character> stack = new Stack<>();

		
		
		//for문으로 문자열 s의 각 요소를 확인함.
		// '('면 stack에 add하고  ')'면 stack에서 pop을 해서, stack을 제거한다. 
		for(int i = 0; i < s.length() ; i++) {
			if( s.charAt(i) == '(') {
				stack.push(s.charAt(i));
				//그게 아니라면의 의미는 ')'이거일때가 문제이다!
			} else {
				//만약 stack이 비어있다. 그러면 false꺼낼게 없으면 false로 보내고, 
				if(stack.isEmpty()) {
					answer = false;
					break; // break해서 빠져나온다.
					
					//비어있지 않다면 즉, 그 전에 '('열린게 있어서! 
					//빼내올게 있다면 pop해서 짝을 맞춰줘야한다.
				} else {
					stack.pop();
				}
			}
		}	
		// for문을 다 돌았어! = 이말은 요소를 다 검증해서 stack에 넣고 빼고를 다했을때,
		// stack에 자료가 남아있다 = isEmpty가 아니다 => 이건 false
		if(!stack.isEmpty()) {
			answer = false;
		}
			
		System.out.println(answer);
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	