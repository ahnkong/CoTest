package level1;

import java.util.Arrays;

public class d241003_푸드파이터 {
	public static void main(String[] args) {
		int[] food = {1, 3, 4, 6};
//		int[] food = {1, 7, 1, 2};
		
		String red = "";
//		String blue = "";
		
		Character water = '0';
		
		
		//이걸 합해줄거야! right + water + left이렇게 가져오면 되는거
		// 문자열의 합 말고, 배열을 하나 더 만들어줘서, arraylist로 만들고,
		// 
		//배열을 문자열로 꺼내올때, 짝수로만 가져올 수 있다.
		// 조건 1) 

		
		int[] half = new int[food.length];
		System.out.println("food는 : "+ Arrays.toString(food));
		
		for (int i = 0; i < food.length; i++) {
            half[i] = food[i]/2;  // 음식의 절반 계산    
		}    
		System.out.println("half는 : " + Arrays.toString(half));
		
		System.out.println("half의 길이 : "+ half.length);
            // 숫자를 half 번 만큼 좌측 문자열에 더해줌
	    for (int i = 0; i < half.length; i++) {
	    	for (int j = 0; j < half[i]; j++) {
		    	if(half[i]>=1) {
			        red += i;
			        System.out.println("red코너 : " + red);
		    	}
	    	}
	    }
	    
	    //for역순 포문!
//	    int halfLength = half.length-1;// => 3
//	    System.out.println(halfLength);
//	    for(int i = half.length-1; i >= 0 ; i--) { // 배열의 인덱스가 0부터 시작하니까 -1해주는거! => 3, 2, 1, 0
//	    	for (int j = 0; j < half[i]; j++) { // 3-0 => 3
//	    		if(half[i]>=1) {
//	    			blue += i;
//	    			System.out.println("blue코너 : " + blue);
//	    		}
//	    	}	
//		}
		String blue = new StringBuilder(red).reverse().toString();
		String answer = red + water + blue; // 문자열은 오는 순서대로 붙으니까!

		System.out.println(answer);
//		System.out.println("최종 답 : " + answer);
	}
}