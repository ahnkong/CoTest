package level0;


//3번 ) 중복된 숫자 개수
public class Day0813_3  {
    public int solution(int[] array, int n) {
    	
        int answer = 0;
        //for문 (일반)
//        for (int i = 0; i < array.length; i++) {
//        	if(array[i]==n) {
//        		answer++;
//        	}
//        }
        
        //향상된 for문 foreach문!
        for(int num : array) {
        	if(num == n) answer++;
        }
        
        return answer;
    }  // => 
    	//프로그래머스에서 문제 복사해서 -> 클래스 이름 바꾸고
    	// 사이에 로직을 만들어주고
    	// 밑에서 main 함수 만들어줘서!
    	// 여기서 출력만 하면 되는구나!
    
    public static void main(String[] args) {
    	Day0813_3 sol = new Day0813_3();
    	
    	int[] array = {1,1,2,3,4,5};
    	int n = 1;
    	
    	int result = sol.solution(array, n);
    	System.out.println(result);
    	
	}
}

	