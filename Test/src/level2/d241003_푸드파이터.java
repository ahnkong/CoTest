package level2;

import java.util.Arrays;

public class d241003_푸드파이터 {
	public static void main(String[] args) {
//		int[] food = {1, 3, 4, 6};
		int[] food = {1, 7, 1, 2};
		
		String red = "";
//		String blue = "";
		
		Character water = '0';
		
		
		//이걸 합해줄거야! right + water + left이렇게 가져오면 되는거
		// 문자열의 합 말고, 배열을 하나 더 만들어줘서, arraylist로 만들고,
		// 
		//배열을 문자열로 꺼내올때, 짝수로만 가져올 수 있다.
		// 조건 1) 
//		for(int count : food) {
//			numFood+=count;
//			System.out.println("총 음식 갯수 : " + numFood);
//			
//		
//        int intValue1 = 123;        
//        int intValue2 = -123;     
//        
//        String str1 = intValue1 + "";        
//        String str2 = intValue2 + "";  
//        
//        
//        System.out.println(str1);        
//        System.out.println(str2);
        
        
//		int[] menu = new int[food.length];
//		
//
//		for (int i = 0; i < food.length; i++) {
//			menu[i] = food[i]/2;
//			System.out.print(menu[i]+ " ");
//		}
//		System.out.println();
//		
//		System.out.println(Arrays.toString(menu));
		
		int[] half = new int[food.length];
		System.out.println("food는 : "+ Arrays.toString(food));
		
		for (int i = 0; i < food.length; i++) {
            half[i] = food[i]/2;  // 음식의 절반 계산    
		}    
		System.out.println("half는 : " + Arrays.toString(half));
		
            // 숫자를 half 번 만큼 좌측 문자열에 더해줌
	    for (int i = 0; i < half.length; i++) {
	    	for (int j = 0; j < half[i]; j++) {
		    	if(half[i]>=1) {
			        red += i;
			        System.out.println("red코너 : " + red);
		    	}
	    	}
	    }
		String blue = new StringBuilder(red).reverse().toString();
		String answer = red + water + blue; // 문자열은 오는 순서대로 붙으니까!

		System.out.println(answer);
//		System.out.println("최종 답 : " + answer);
	}
}