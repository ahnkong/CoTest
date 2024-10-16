package level1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;

/*
배열 arr가 주어집니다. 배열 arr의 각 원소는 숫자 0부터 9까지로 이루어져 있습니다. 이때, 배열 arr에서 연속적으로 나타나는 숫자는 하나만 남기고 전부 제거하려고 합니다. 단, 제거된 후 남은 수들을 반환할 때는 배열 arr의 원소들의 순서를 유지해야 합니다. 예를 들면,
arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 이면 [4, 3] 을 return 합니다.
배열 arr에서 연속적으로 나타나는 숫자는 제거하고 남은 수들을 return 하는 solution 함수를 완성해 주세요.

arr = [1, 1, 3, 3, 0, 1, 1] 이면 [1, 3, 0, 1] 을 return 합니다.
arr = [4, 4, 4, 3, 3] 		이면 [4, 3] 을 	   return 합니다.

 */


//핵심 : 스택 사용!
public class 같은숫자는싫어 {
	public static void main(String[] args) {
//		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		int[] arr = {4,4,4,3,3};
		
//		int[] answer = {};
		
		Stack<Integer> stack = new Stack<>();
		
		
//		stack.push(arr[0]);
		
		
		//일단 arr에서 첫번째 비교할 숫자 넣어줌!
		stack.push(arr[0]);
		
		for(int i = 0 ; i < arr.length ; i++) {
			if(stack.peek() != arr[i]) {
				stack.push(arr[i]);
//				System.out.println("stack의 맨 위의 값 : " + stack.peek());
			}
//			else {
//				break;
//			}
		}		
		
		//출력 1) for문
		int[] answer = new int[stack.size()];
		for (int j = 0; j < answer.length ; j++) {
			answer[j] = stack.get(j);
		} 
		
		// 출력 2) for-each
		for(int temp : stack) {
			System.out.print(temp);
		}
		
		// 출력 3) 걍 뽑아내기!
		System.out.println(stack);
		
		
		
//		System.out.println();
	
		}
	}
