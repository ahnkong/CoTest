package Level3;

import java.util.LinkedList;
import java.util.Queue;

/*주어진 항공권을 모두 이용하여 여행경로를 짜려고 합니다. 항상 "ICN" 공항에서 출발합니다.

항공권 정보가 담긴 2차원 배열 tickets가 매개변수로 주어질 때, 방문하는 공항 경로를 배열에 담아 return 하도록 solution 함수를 작성해주세요.

제한사항
모든 공항은 알파벳 대문자 3글자로 이루어집니다.
주어진 공항 수는 3개 이상 10,000개 이하입니다.
tickets의 각 행 [a, b]는 a 공항에서 b 공항으로 가는 항공권이 있다는 의미입니다.
주어진 항공권은 모두 사용해야 합니다.
만일 가능한 경로가 2개 이상일 경우 알파벳 순서가 앞서는 경로를 return 합니다.
모든 도시를 방문할 수 없는 경우는 주어지지 않습니다.

tickets : [["ICN", "JFK"], ["HND", "IAD"], ["JFK", "HND"]] ,   [["ICN", "SFO"], ["ICN", "ATL"], ["SFO", "ATL"], ["ATL", "ICN"], ["ATL","SFO"]]
return : ["ICN", "JFK", "HND", "IAD"]								["ICN", "ATL", "ICN", "SFO", "ATL", "SFO"]*/
public class 여행경로 {
	public static void main(String[] args) {
		
//		int [][] tickets;
//		int [][] tickets = new int[2][3];
		String[][] tickets = {
			    {"ICN", "JFK"},
			    {"HND", "IAD"},
			    {"JFK", "HND"}
			};
			
		//배열을 해야하나, 큐를 써야하나
		//맨 처음인 ICN의 값을 넣고 
		//ICN을 무조건 
		Queue<String> queue = new LinkedList<>();
		
		
        // ICN을 먼저 큐에 추가하고, 그 다음 목적지들을 큐에 순서대로 넣음
        for (String[] ticket : tickets) {
            if (ticket[0].equals("ICN")) {
                // ICN을 큐에 추가
                queue.offer(ticket[0]); // ICN 추가

                // ICN 다음 목적지인 JFK를 큐에 추가
                queue.offer(ticket[1]); // JFK 추가
                }
            }// ICN 찾았으면, 다음 요소를 equals를 때려서, 계속 루프 돌면서 모든 2차원 배열을 검색해 볼 수 잇게 해야하는데..
        // 실패다...아이돈노..
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
//		String[] answer = {};
		
		
	}
}
