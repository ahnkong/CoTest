package level1;

import java.util.ArrayList;
import java.util.Iterator;

public class d241012_K번째수_정렬 {
	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
//		ArrayList<Integer> cut = new ArrayList<>(); // 일단 array.lengt의 길이를 넘어가지 않을거기 때문에 7로 선언
		int[] cut = new int[7];
		
		int[] answer = {};
		int first = 0;
		int second = 0;
		
//		System.out.println(commands[0][0]);//2
//		System.out.println(commands[0][1]); //5
//		System.out.println(commands[0][2]);//3
//		
//		
//		System.out.println(commands[1][0]);//4
//		System.out.println(commands[1][1]); //4
//		System.out.println(commands[1][2]);//1
		
		
		
		for (int i = 0; i < commands.length; i++) {
			first = commands[i][0];
			System.out.println(i + "번째 - " + first);
			
		}	
		System.out.println("-----------------");	
			
		for (int i = 0; i < commands.length; i++) {
			second = commands[i][1];
			System.out.println(i + "번째 - " + second);
			
					

		}
	}

}
