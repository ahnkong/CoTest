/// 설명
//정수가 담긴 리스트 num_list가 주어질 때, num_list의 원소 중 짝수와 홀수의 개수를 담은 배열을 return 하도록 solution 함수를 완성해보세요.

package level0;


public class Day0813_4 {
	class Solution {
	    public int[] solution(int[] num_list) {
	    
	    	int[] answer = {0,0};
	    	
	        for(int num : num_list) {
	        	if(num % 2 == 0) {
	        		answer[0]++;
	        	} else {
	        		answer[1]++;
	        	}
	        }
	        
	        return answer;
	    }
	}
	    	
	
//	public static void main(String[] args) {
//		
//		Day0813_4 sol = new Day0813_4();
//		int[] array = {1, 2, 3, 4, 5};
//		
//        int[] result = sol.solution(array);  // solution 메서드 호출
//        
//        // 배열의 결과를 출력하기 위해 Arrays.toString() 사용
//        System.out.println(java.util.Arrays.toString(result));  // [2, 3] 출력 예상
//    }
}
	