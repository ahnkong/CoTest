package level1;



public class d240918_없는숫자더하기 {

	public static void main(String[] args) {
		
		
		//배열 2개를 생성하여, 합으로 비교하는 방법
		
		int[] numbers = {1,2,3,4,6,7,8,0};
//		int total = 0+1+2+3+4+5+6+7+8+9;
		int total = 0;
		for (int i = 0; i <= 9; i++) {
			total = total + i;
		}
		System.out.println("total의 합은 " + total);
		
		
		int temp = 0;
		
		
		for(int number : numbers) {
			temp = temp +number;
			System.out.println(temp);
		}
		System.out.println(total-temp);
		
	}
}
