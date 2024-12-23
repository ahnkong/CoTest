package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class d241028_방문길이2 {
    public static void main(String[] args) {
        String dirs = "ULURRDLLU";
//        String dirs = "UDLRDURL";
        int answer = 0;
        
        //좌표는 0,0에서 시작
        int x = 0;
        int y = 0;
        int index = 0; // 인덱스 역할로 사용할 변수
        
        // 좌표를 저장할 HashMap 생성
//        HashMap<Integer, int[]> hash = new HashMap<>();
        HashMap<String, Integer> pathMap = new HashMap<>();

        for (int i = 0; i < dirs.length(); i++) {
            int prevX = x;
            int prevY = y;

            System.out.println("문자열 : "+ dirs.charAt(i));
            
            // 명령에 따른 좌표 이동
            if (dirs.charAt(i) == 'U') { 
            	y++;
            }	
            if (dirs.charAt(i) == 'D') { 
            	y--;
            }	
            if (dirs.charAt(i) == 'R') {
            	x++;
            }
            if (dirs.charAt(i) == 'L') { 
            	x--;
            }
            
            System.out.println("x,y : " + x + "," + y  );
            // 범위 체크 (-5 <= x, y <= 5)
            if (x < -5 || x > 5 || y < -5 || y > 5) {
                x = prevX; // 범위를 벗어나면 이전 위치로 돌아감
                y = prevY;
                continue;
            }
            
            
            String startRoute = prevX + ", " + prevY + " -> " + x + ", " + y;
            String endRoute = x + ", " + y + "-> " + prevX + ", " + prevY;
            
//            System.out.println(startRoute + " + " + endRoute);
            
            
            // 경로가 중복되지 않은 경우에만 추가 (양방향 모두 체크)
            if (!pathMap.containsKey(startRoute) && !pathMap.containsKey(endRoute)) {
                pathMap.put(startRoute, 1);
                pathMap.put(endRoute, 1);
                answer++; // 중복되지 않은 경로 카운팅
            }
            
            // 현재 경로와 HashMap 상태 출력
//            System.out.println("현재 경로: " + startRoute);
            System.out.println("HashMap 상태:");
            for (String key : pathMap.keySet()) {
                System.out.println("Key: " + key + ", Visited: " + pathMap.get(key));
            }
            System.out.println("현재 위치: (" + x + ", " + y + ")");
            System.out.println("지금 경로수 : " + answer);
        }
        
        System.out.println("중복되지 않은 경로 수: " + answer);
    }
}


















