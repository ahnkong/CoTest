package level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class d241103_귤고르기 {
	public static void main(String[] args) {
		
		int k = 4;
		int sum =0;
		int cnt = 0;
		int answer = 0;
		int[] tangerine = {1,3,2,5,4,5,2,3};
		
//		Arrays.sort(tangerine);
//		System.out.println(Arrays.toString(tangerine));
		
		
		//1. 사이즈와 귤의 갯수를  hashmap으로 짝지어 주기
		HashMap<Integer, Integer> tangSize = new HashMap<>();
		for(int tangerines : tangerine) {
			tangSize.put(tangerines, tangSize.getOrDefault(tangerines, 0)+1);
			// tangSize에 tangerines 이거랑 같은 값이 키로 존재하는지 찾아줘! // 없으면 0으로 반환하고,
		}
		System.out.println(tangSize);
		
		
//		System.out.println(tangSize.size());
	
		
//        // 2. 갯수가 많은 순으로 내림차순으로 정렬
        ArrayList<Integer> bigPcs = new ArrayList<>(tangSize.values());
        Collections.sort(bigPcs, Collections.reverseOrder());
        
 
//        Integer[] bigPcs = tangSize.values().toArray(new Integer[0]); // hashmap의 반환타입을 맞춰주기 위해 int[]이 아닌 Integer[]을 사용
//        Arrays.sort(bigPcs, Collections.reverseOrder());
//        
        // 3. 갯수가 많은 것부터 선택하여 k개를 채울 때까지 종류 수 카운트
        for (int count : bigPcs) {
            sum += count; // 현재 크기의 귤 개수를 더해가며 k개에 도달할 때까지 진행
            cnt++;        // 사용한 귤 종류의 수를 증가
            if (sum >= k) { // k개 이상이 되면 종료
                break;
            }
        }
        
        System.out.println("최소 종류의 수: " + cnt); // 결과 출력
    }    
}