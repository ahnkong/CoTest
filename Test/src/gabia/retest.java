package gabia;

import java.util.ArrayList;
import java.util.Collections;

public class retest {
// 어레이 리스트로 간다!
	// set을 이용해서, 바꿔주면서 
	public static void main(String[] args) {
		
		int N = 5;
		int[] A = {4, 16, 4, 5, 4};
		
		
		ArrayList<Integer> ties = new ArrayList<>();
		//타이 어레이리스트에 넣기
		for(int tie : A) {
			ties.add(tie);
			System.out.println(ties);
		}
		
		System.out.println(ties);
		
		int attach = 0;
		System.out.println(ties.size());
		
		for (int i = 0; i < N ; i++) {
			System.out.println("i가 " + i +" 일 때 " );
			
			for (int j = 1 ; j < N ; j++) {
				if( ties.get(i) == ties.get(i+j)) {
					System.out.println("i와 j : " + i + " " + j);
					attach = (ties.get(i) + ties.get(j));
					
					System.out.println(ties.get(i) + "와" + ties.get(j));
					System.out.println("합친 끈의 길이 : " + attach);
					System.out.println(ties);
					
					ties.set(ties.get(i), attach);
					
					System.out.println(ties);
					ties.remove(ties.get(j));

					
				} else if( ties.get(i) - ties.get(i+j) == 1 || ties.get(i) - ties.get(i+j) == -1 ) {
					attach = ties.get(i)+ties.get(j);
					ties.set(ties.get(i), attach);
					ties.remove(ties.get(j));
				}
				
			}
			System.out.println();
		}
		System.out.println(ties);
	
	}
	
}
