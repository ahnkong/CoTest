package practiceCode;

import java.util.HashMap;
import java.util.Map;

public class 메모제이션 {
	private static Map<Integer, Integer> memo = new HashMap<>();

	
	//--------------------------------
	public static void main(String[] args) {
		
	int n = 10;
	System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
	
	}
	
	
	//------------------------------------
	public static int fibonacci(int n) {
		if(n == 0) return 0;
		if(n == 1) return 1;
		
		//이미 계산된 값이 있으면 그 값을 반환
		if(memo.containsKey(n)) {
			return memo.get(n);
		}
	
		//계산한 값을 메모에 저장
		int result = fibonacci(n-1) + fibonacci(n-2);
		memo.put(n, result);
		
		
		return result;
	}	
}
