package gabia;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Practice {
	public static void main(String[] args) {
		
		int n = 5;
		int[][] A = {{84,70}, {60, 55}, {56,86}, {73,90}, {94,58}};
		int answer = 0;
//		
//
//		
		int math = 0; //수학점수
		int en = 0; //영어점수
		int sum = 0;
//		int[] test = new int[5];
//		HashMap<Integer, Integer> score = new HashMap<>();
////		
////		
//		for (int i = 0; i <	A.length; i++) {
//				math = A[i][0];
//				en = A[i][1];
//				System.out.println(i + "+" + "   math는 : " + math + "    en는 : " + en);
//				test[i] += math+en;
//				score.put(test[i], math);
//				System.out.println(Arrays.toString(test));
//				System.out.println(score);
//			}

		Map<Integer, int[]> scoreMap = new HashMap<>();
		
		for (int i = 0; i < A.length; i++) {
			math = A[i][0];
			en = A[i][1];			
			sum = math+en;
			scoreMap.put(sum,  new int[] {math, en});

		}
		
		List<Integer> keyList =new ArrayList<>(scoreMap.keySet());
		
		
		Collections.sort(keyList);
		Collections.reverse(keyList);
		
		
		int mathMin = Integer.MAX_VALUE;
		int enMin = Integer.MAX_VALUE;
		

		
		for (int i = 0; i < 3; i++) {
			int sumKey = keyList.get(i);
			int[] scores = scoreMap.get(sumKey);
			mathMin = Math.min(mathMin, scores[0]);
			enMin = Math.min(enMin, scores[1]);
		}
		
		int res = mathMin + enMin;
		
		System.out.println(res);
		
		
		}

		
	}
			

//------------------------------------------------
//int answer = 0;
//
//int math = 0;
//int en = 0;
//int sum = 0;
//
//Map<Integer, int[]> scoreMap = new HashMap<>();
//for(int i = 0; i < A.length; i++){
//    math = A[i][0];
//    en = A[i][1];
//    sum = math + en;
//    scoreMap.put(sum, new int[]{math, en})
//}
//
//List<Integer> keyList = new ArrayList<>(scoreMap.keySet());
//
//Collections.sort(keyList);
//Collections.reverse(keyList);
//
//
//int mathMin = Integer.MAX_VALUE;
//int enMin = Integer.MAX_VALUE;
//
//
//for(int i = 0; i < 3; i++){
//
//    int sumKey = keyList.get(i);
//    int[] scores = scoreMap.get(sumKey);
//
//    mathMin = Math.min(mathMin, scores[0]);
//    enMin = Math.min(enMin, scores[1]);
//
//}
//
//answer = mathMin + enMin;
//return answer;

