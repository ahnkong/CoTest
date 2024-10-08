package level1;

import java.util.ArrayList;
import java.util.HashSet;

public class 체육복 {
	
	/*점심시간에 도둑이 들어, 일부 학생이 체육복을 도난당했습니다. 
	 * 다행히 여벌 체육복이 있는 학생이 이들에게 체육복을 빌려주려 합니다. 
	 * 학생들의 번호는 체격 순으로 매겨져 있어, 바로 앞번호의 학생이나 바로 뒷번호의 학생에게만 체육복을 빌려줄 수 있습니다. 
	 * 예를 들어, 4번 학생은 3번 학생이나 5번 학생에게만 체육복을 빌려줄 수 있습니다. 
	 * 체육복이 없으면 수업을 들을 수 없기 때문에 체육복을 적절히 빌려 최대한 많은 학생이 체육수업을 들어야 합니다.
	
	전체 학생의 수 n, 체육복을 도난당한 학생들의 번호가 담긴 배열 lost, 
	여벌의 체육복을 가져온 학생들의 번호가 담긴 배열 reserve가 매개변수로 주어질 때, 
	체육수업을 들을 수 있는 학생의 최댓값을 return 하도록 solution 함수를 작성해주세요.
	
	제한사항
	전체 학생의 수는 2명 이상 30명 이하입니다.
	체육복을 도난당한 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
	여벌의 체육복을 가져온 학생의 수는 1명 이상 n명 이하이고 중복되는 번호는 없습니다.
	여벌 체육복이 있는 학생만 다른 학생에게 체육복을 빌려줄 수 있습니다.
	여벌 체육복을 가져온 학생이 체육복을 도난당했을 수 있습니다. 이때 이 학생은 체육복을 하나만 도난당했다고 가정하며, 
	남은 체육복이 하나이기에 다른 학생에게는 체육복을 빌려줄 수 없습니다.
	 */

	public static void main(String[] args) {
		
		int n = 5;
		int[] lost = {2,4};
		int[] reserve = {1,3,5};
		// 1) set 2) 배열
		int[] student = new int[n+2];
		// 각 배열의 값은 0으로 초기화
		int answer = 0;
		
		
		//forEach문을 통해, student 배열의 값을 변환시키기.
		//1. lost배열에 잇는 모든 요소들을 하나씩 꺼내서 'l'이라는 변수에 할당하는것?
		//l
		for(int l : lost)
			student[l]--;
		for(int r: reserve)
			student[r]++;
		
		//for문을 돌려 student 배열 값 조정하기 : 
		for(int i =1; i<=n ; i++) { 
			if(student[i] == 1) {
				if(student[i-1] == -1) {
					student[i]--; //student 배열의 i번째 인덱스에 해당하는 값을 1감소하는것
					student[i-1]++; //student 배열의 i-1번째 인덱스에 해당하는 값을 1증가 시키는 것
				}
				else if(student[i+1] == -1) {
					student[i]--;
					student[i+1]++;
					
				}
			}
			
		}
		for(int i = 1; i<=n ; i++) {
			if(student[i] >= 0)
				answer++;
		}
		
		System.out.println(answer);
	}  
	
	
	
}
