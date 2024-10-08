package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class d240926_힙_더맵게 {
	public static void main(String[] args) {
		/*
		 *  맨앞의 인덱스와 다음 인덱스의 합을 다시 넣어준 다음 sort처리
		 *  배열의 0번째 : 스코빌 지수가 가장 작은 수
		 *  배열의 1번째 : 두번째로 맵지 않은 음식의 스코빌 지수
		 *  => 배열의 추가와 삭제가 편리해야하므로 ArrayList를 선택
		 *  
		 *  //ArrayList							PriorityQueue
		 *  add() : 추가					|   add()
		 *  set() : 값 변경
		 *  remove(), clear() : 삭제		| 	poll()
		 *  get() : 값읽기
		 *  
		 *  모든 음식의 스코빌 지수를 K 이상으로 만들 수 없는 경우에는 -1을 return 합니다.
		 * */
		int[] scoville = {1, 2, 3, 9, 10, 12};
		int K = 7;
		int cnt = 0;
		int answer = 0;
		
		PriorityQueue<Integer> dishes = new PriorityQueue<>();
		
		for(int dish : scoville) {
			dishes.add(dish);
		}
		System.out.println("PriorityQueue로 변환 확인 : " + dishes);
		
		//1-> peek,poll사용
		
		System.out.println();
		
		
		
		
		//스코빌 지수가 k이상 될때까지 반복
		while(dishes.size() > 1 && dishes.peek() < K) { 
			// 2개의 수가 있어야 섞을 수 있으므로 
			// 우선 순위 큐에서는 dishes.peek()이게 가장 작은 수를 의미한다!
			
			
			//정렬해서, 최소값, 그다음으로 큰 수 2개를 섞어야함.
			//=> 우선 순위 큐는 앞에 먼저 들어가게 되므로, 정렬 자체가 X
			
			int first = dishes.poll(); // 가장 작은 값 꺼내기
			System.out.println("first는 : " + first +"  |  first 제거 확인: " +dishes);

			int second = dishes.poll(); // 두번째로 작은 값 꺼내기
			System.out.println("second는 : " + second +"  |  second 제거 확인: " +dishes);
			
			//새로운 스코빌 지수 계산
			int newScoville = first + second * 2;
			System.out.println("추가된 스코빌 지수 : " + newScoville);
			//계산 후 first랑, second제거
			
			dishes.add(newScoville);
			//잘 추가 됐나 확인
			System.out.println(dishes);
			cnt++;
			System.out.println("횟수 : " + cnt);
			System.out.println();	
		}
		if(dishes.peek() < K) {
			cnt = -1;
		};
		
		
		System.out.println(cnt);
	}
}
		
		
		
//--------------------------------------------------------------------		
//		//1)목적 : 배열의 값들로 스코빌 지수 계산을 했을때, 지수 7을 넘기 위해 최소 몇번 섞어야 하는가! 
//		ArrayList<Integer> dishes = new ArrayList<>(); //=> 런타임에러
//		
//		for(int dish : scoville) {
//			dishes.add(dish);
//		}
//		System.out.println("arrayList로 변환 확인 : " + dishes);
//		
//		//1) 늘 sort는 필요! 
//		//2) 어레이 리스트의 값이 k이상이면 종료
//		//3) 한번 계산 할때마다 cnt++ 해줘야 return할수 잇음
//		
//		System.out.println();
//		
//		
//		
//		
//		//스코빌 지수가 k이상 될때까지 반복
//		while(dishes.get(0) < K) {
//			//정렬해서, 최소값, 그다음으로 큰 수 2개를 섞어야함.
//			Collections.sort(dishes);
//			
//			int first = dishes.remove(0); // 먼저 제거하고 나면
//			System.out.println("first는 : " + first +"  |  first 제거 확인: " +dishes);
//
//			int second = dishes.remove(0); // 얘가 처음이 되니까 둘다 0으로 지정 , remove는 삭제하고 반환
//			System.out.println("second는 : " + second +"  |  second 제거 확인: " +dishes);
//			
//			//새로운 스코빌 지수 계산
//			int NewScoville = first + second * 2;
//			System.out.println("추가된 스코빌 지수 : " + NewScoville);
//			//계산 후 first랑, second제거
//			
//			dishes.add(NewScoville);
//			//잘 추가 됐나 확인
//			System.out.println(dishes);
//			cnt++;
//			System.out.println("횟수 : " + cnt);
//			System.out.println();	
//		}
//		
//		System.out.println(cnt);
//	}
//}

//Arrays.sort(scoville);
//
//for (int i = 0; i < scoville.length; i++) {
//	
//	if(scoville[i] < K) {
//		
//		int newScoville = scoville[i] + scoville[i+1]*2;
//		scoville[0] = newScoville;			
//		System.out.println("새롭게 추가된 스코빌 : " + newScoville);
//		System.out.println(Arrays.toString(scoville));
//		
//		Arrays.sort(scoville);
//		
//	} else {
//		break;
//	}
//	
//	
//}
////		System.out.println(dishes);