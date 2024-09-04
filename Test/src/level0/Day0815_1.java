package level0;

public class Day0815_1 {
    public double solution(int[] numbers) {
    	
    	// num은 담는 numbers라는 배열에서 나온 수를 담는 변수에 불과하구나 그럼 이름 바꿔도 되는거징
    	// for-each 루프에서 사용하는 변수 num의 타입은 배열의 요소 타입과 일치 시켜야한다.
    	// 예를 들어, 배열 numbers가 int[] 타입이라면 요소는 int 타입이며, num도 int로 선언되어야 함.
    	
    			/**처음에 오류났던 이유
    			 * int sum = 0; 으로 형태를 다르게 선언했기 때문이다.*/
    	
        double answer = 0;
        double sum = 0;
        
        // 배열 출력하는 방법
        // 1) forEach문 사용  2) Arrays.toString(배열명) 3) for문으로 클래식 하게 돌리기
        for ( int abc : numbers) {
            sum += abc;
        
        }
        answer = sum / numbers.length;
        
        return answer;
//       // 2) Arrays.toString() 사용
//        System.out.println("Using Arrays.toString():");
//        System.out.println(Arrays.toString(numbers));
//
//        // 3) for문으로 클래식하게 출력하기
//        System.out.println("Using classic for loop:");
//        for (int i = 0; i < numbers.length; i++) {
//            System.out.print(numbers[i] + " ");
//        }
        
        
    }
    
    public static void main(String[] args) {

    	Day0815_1 sol = new Day0815_1();
    	int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};


        // solution 메서드 호출
        double result = sol.solution(numbers);
        System.out.println("Average: " + result);

     }
}    

