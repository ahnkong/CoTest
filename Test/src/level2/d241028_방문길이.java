package level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class d241028_방문길이 {
    public static void main(String[] args) {
        String dirs = "ULURRDLLU";
        int answer = 0;
        
        int x = 0;
        int y = 0;
        int index = 0; // 인덱스 역할로 사용할 변수
        
        // 좌표를 저장할 HashMap 생성
        HashMap<Integer, int[]> hash = new HashMap<>();
        
        for (int i = 0; i < dirs.length(); i++) {
            int prevX = x;
            int prevY = y;
            
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
            
            
            // 범위 체크 (-5 <= x, y <= 5)
            if (x < -5 || x > 5 || y < -5 || y > 5) {
                x = prevX; // 범위를 벗어나면 이전 위치로 돌아감
                y = prevY;
                continue;
            }
            
            
            String startRoute = prevX + " " + prevY + "-" + x + y;
            String endRoute = x + " " + y + "-" + prevX + prevY;
            
            // 현재 위치를 arr2에 저장
            int[] arr2 = {x, y};
            
            // HashMap에 중복된 좌표가 없는 경우에만 추가(Integer, int[])
            boolean isDuplicate = false;
            for (int[] value : hash.values()) {
                if (Arrays.equals(value, arr2)) {
                    isDuplicate = true;
                    break;
                }
            }
            
            // 중복되지 않은 경우에만 HashMap에 추가
            if (!isDuplicate) {
                hash.put(index++, arr2); // 현재 인덱스를 키로 사용
                answer++; // 중복되지 않은 경로 카운팅
            }
            
            System.out.println("HashMap 상태:");
            for (Map.Entry<Integer, int[]> entry : hash.entrySet()) {
                System.out.println("Key: " + entry.getKey() + ", Value: " + Arrays.toString(entry.getValue()));
            }            System.out.println("현재 위치: (" + x + ", " + y + ")");
        }
        
        System.out.println("중복되지 않은 경로 수: " + answer);
    }
}