package level0;


// 이렇게 어이없는걸루.....시간을...더 효율적인게 잇을테데
public class d241030_두정수사이의합 {
	public static void main(String[] args) {
		int a = 3;
		int b = 3;
		long answer =0;
		long temp =0;
		
		temp = Math.abs(a-b);	
		if(a!=b) {
			answer = a+b;
		} else {
			answer = a;
		}
		System.out.println("시작값 : " + answer );
		
		
		System.out.println("두수 사이의 값 : " + temp);
		for (int i = 1; i < temp; i++) {
			System.out.println(answer);
			if( a<b) {
				answer += a + i;
				System.out.println("a + i : " + a + " + " + i + " = "+answer);
				
			} else {
				answer += a -i ;
				System.out.println("값 : "+ answer);
			}
        }  
		System.out.println(answer);
	}
}
