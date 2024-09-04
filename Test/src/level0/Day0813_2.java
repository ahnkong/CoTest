package level0;



// 8/13	
// 2)문자열의 길이		
	
public class Day0813_2 {

    // solution 메서드 선언: String 배열을 입력받아, 각 문자열의 길이를 담은 int 배열을 반환합니다.
    public int[] solution(String[] strings) {
        
        // 입력된 문자열 배열의 길이만큼의 크기를 가진 int 배열을 초기화합니다.
        int[] answer = new int[strings.length];

        // 배열의 각 요소에 대해 반복합니다.
        for(int i = 0; i < strings.length; i++){
            
            // 현재 문자열(strings[i])의 길이를 계산하여 answer 배열의 i번째 위치에 저장합니다.
            // 예를 들어, i가 2일 때 strings[2]는 "the"이고, 그 길이는 3입니다.
            // 따라서 answer[2]에 3이 저장됩니다.
            answer[i] = strings[i].length();
        }
        
        // 각 문자열의 길이를 담은 answer 배열을 반환합니다.
        // 예시 입력이 ["We", "are", "the", "world!"]라면,
        // answer 배열은 [2, 3, 3, 6]이 됩니다.
        return answer;
    }

    // main 메서드 추가: 프로그램의 시작점
    public static void main(String[] args) {
        // Solution 클래스의 인스턴스를 생성합니다.
        Day0813_2 sol = new Day0813_2();
        
        // 테스트할 문자열 배열을 생성합니다.
        String[] strlist = {"We", "are", "the", "world!"};
        
        // solution 메서드를 호출하고 결과를 int 배열로 받습니다.
        int[] result = sol.solution(strlist);
        
        // 결과 배열을 출력합니다.
        for (int length : result) {
            System.out.println(length);
        }
    }
}
