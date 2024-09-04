package level0;

import java.util.Arrays;

public class Day0815_2 {
    public int[] solution(int[] num_list) {
        
    	int[] answer = new int[num_list.length];
    	
    	for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length-1-i];
		}
    	
        return answer;
    }
    
    
    public static void main(String[] args) {
    	
    	Day0815_2 sol = new Day0815_2();
    	
    	int[] num_list = {1, 2, 3, 4, 5};
    	
    	int[] answer = new int[num_list.length];
    	
    	for (int i = 0; i < num_list.length; i++) {
			answer[i] = num_list[num_list.length-1-i];
		}
    	
    	//		System.out.println(answer); //=> 주소로 출력 -[I@58ceff1

    	/**
    	 * ★ 이렇게 Arrays.toString을 사용
    	 * Java에서 배열의 요소들을 문자열로 변환하여 출력하는 데 사용
    	 * 배열을 바로 System.out.println()으로 출력하려고 하면 배열의 메모리 주소가 출력되기 때문에, 
    	 * Arrays.toString()을 사용해 배열의 각 요소를 사람이 읽을 수 있는 형식으로 출력하는 것이 일반적
    	 * */
    	int[] reversed = sol.solution(num_list);
    	System.out.println(Arrays.toString(reversed));
    	
	}
}
