package level1;

import java.util.Arrays;
import java.util.HashMap;

import practiceCode.hash연습;

public class d241018_추억점수 {
	public static void main(String[] args) {
		
		String[] name = {"may", "kein", "kain", "radi"};
		int[] yearning = {5, 10, 1, 3};
		String[][] photo = {
				{"may", "kein", "kain", "radi"},
				{"may", "kein", "brin", "deny"},
				{"kon", "kain", "may", "coni"}
		};
		
		int[] result = new int[photo.length];
		int[] answer = new int[photo.length];
		int sum = 0;
		int temp = 0;
		
		
		// 키:밸류  구조로 접근하여, 값을 더할 수 있도록!
		// name : 그리움 점수
		// photo에 name이 있으면, 키랑 비교해서 - 키에 해당하는 값(=그리움점수)를 누적
		HashMap<String, Integer> scoreBoard = new HashMap<>();
		
//		for(int i = 0; i < name.length; i++) {			
//			scoreBoard.put(name[i], yearning[i]);
//			System.out.println(scoreBoard);
//		}
		
		int index = 0;
		for(String str : name) {
			scoreBoard.put(str, yearning[index++]);
		}
		
		System.out.println("scoreBoard : " + scoreBoard);
		
		for (int i = 0; i <photo.length; i++) {
			System.out.println(i + "번째 행 탐색 -> ");

			for (int j = 0; j < photo[i].length; j++) {
				if(scoreBoard.containsKey(photo[i][j])) {
					System.out.println("    " + photo[i][j] + " : 그리움점수 " + scoreBoard.get(photo[i][j]));
					sum += scoreBoard.get(photo[i][j]);
					result[i] += sum;
					
				} else { // 사실 이거 추가 안해줘도 되는데, 출력문 이쁘게 하려고 추가
//					System.out.println();
				}
			sum = 0; // 다음 행을 탐색할때, 다시 0으로 초기화
				
			}
			System.out.println("    " + Arrays.toString(result));
			System.out.println();
			answer = result;
		}
		System.out.println("최종 출력 " + Arrays.toString(answer));
	}
}
