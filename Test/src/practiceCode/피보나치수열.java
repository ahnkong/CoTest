package practiceCode;
//피보나치수열, 점화식



public class 피보나치수열 {
		
	public static int fibonacci(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		return fibonacci(n-1) + fibonacci(n-2);
		
		
	}
	
	public static void main(String[] args) {
		
	int temp = 10; // 예시로 n = 10
    for (int i = 0; i <= temp; i++) {
        System.out.println("Fibonacci(" + i + ") = " + fibonacci(i));
	
    }
   }
}
