package level1;
//6분
public class d240918_음양더하기 {
	public static void main(String[] args) {
		
		int[] absolutes = {4,7,12};
		
		boolean[] signs = {true,false,true}; // 참:양수 | 거짓:음수
		
		int temp = 0;
		
//		for( int absolute : absolutes) {
//			System.out.print(absolute + " ");
//		}
//		for (int i = 0; i < absolutes.length; i++) {
//			temp = temp + absolutes[i];
//		}
		
		
		for(int i = 0; i < signs.length; i++) {
			if(signs[i] == true) {
				temp = temp + absolutes[i];
			}
			else {
				temp = temp - absolutes[i];
			}
//			System.out.println(temp);
		}
		
		System.out.println(temp);
	}
}
