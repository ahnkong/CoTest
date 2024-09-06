package level1;
/*
 * String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.

제한 사항
seoul은 길이 1 이상, 1000 이하인 배열입니다.
seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
"Kim"은 반드시 seoul 안에 포함되어 있습니다.
입출력 예
seoul	return
["Jane", "Kim"]	"김서방은 1에 있다"
 * */
public class 서울에서김서방찾기 {
	//핵심 : 배열의 요소와 조건의 비교
	// 1) seoul 배열을 탐색하여, Kim 조건과 동일한 문자열 탐색(for문)
	// 2) 해당 인덱스 i 를 결과값findKim에 저장하여 return
	public static void main(String[] args) {
		String[] seoul = {"Jane", "Kim"};
		int findKim = 0;
		
		for (int i = 0; i < seoul.length; i++) {
			if("Kim".equals(seoul[i])) {
				findKim = i;
				break; //else 작성해줄 필요없이 
			}
		}
		int answer = findKim;
		System.out.println("김서방은 " + answer + "에 있다");
	}
	
}
