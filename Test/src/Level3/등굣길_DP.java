package Level3;

import java.util.Arrays;
import java.util.Iterator;

// DP : 동적프로그래밍!
// 기억 하기 알고리즘
// 중요! 이전의 결과값을 활용하는 것이다!
/*
 * 계속되는 폭우로 일부 지역이 물에 잠겼습니다. 물에 잠기지 않은 지역을 통해 학교를 가려고 합니다. 집에서 학교까지 가는 길은 m x n 크기의 격자모양으로 나타낼 수 있습니다.
아래 그림은 m = 4, n = 3 인 경우입니다.
가장 왼쪽 위, 즉 집이 있는 곳의 좌표는 (1, 1)로 나타내고 가장 오른쪽 아래, 즉 학교가 있는 곳의 좌표는 (m, n)으로 나타냅니다.

격자의 크기 m, n과 물이 잠긴 지역의 좌표를 담은 2차원 배열 puddles이 매개변수로 주어집니다. 오른쪽과 아래쪽으로만 움직여 집에서 학교까지 갈 수 있는 최단경로의 개수를 1,000,000,007로 나눈 나머지를 return 하도록 solution 함수를 작성해주세요.

m	n	puddles	return
4	3	[[2, 2]]	4
 * */
//


/*
 * retry!
 * 코드를 직관적으로 찍어나가면서 하나하나 접근해보는 방법론을 택해야한다.
 * 따라서 순서대로 해봐야 겠다.
 * 일단 0based => 1based로 만들어주자! 보이기 쉽게!
 * 각 row[i][0] 은 다 0으로 만든다!
 * 
 * */
public class 등굣길_DP {
	
	public static void main(String[] args) {
		
	int n = 3;	int m = 4;	
		
	int[][] map = new int[n+1][m+1]; // 지도 배열
	
	long MOD = 1000000007;
	int[][] puddles = {{2,2}};
	int temp = 0; //답을 더해나갈 temp변수 선언
	
	//1. 물웅덩이 위치를 -1로 셋팅

    for(int[] puddle : puddles) {
    	
    	int row = puddle[0];
    	int col = puddle[1];
    	
    	map[row][col] = -1;
    	
    }
    
    // 2. 시작점 초기화 (1,1에서 시작)
    map[1][1] = 1;
	
    
//    map[1][1] = 1;
    
    
    for(int[] print : map) {
    	for(int element : print) {
    		System.out.print(element + " ");
    	}
    	System.out.println();
    }
    
    
 
//    3. 첫번째 열초기화
	    for (int i = 2; i <= n; i++) {
			//현재 위치가 웅덩이라면
			if(map[i][1] == -1) {
				map[i][1] = 0; //경로수를 0으로 해서 계산해줘
			} else {
				map[i][1] = map[i-1][1];
			}
	    }	
		
	    //4. 첫 번째 행 초기화 (왼쪽에서만 경로를 받아올 수 있음)
	    for (int j = 2; j <= m; j++) {
	    	//현재 위치가 웅덩이라면
	    	if(map[1][j] == -1) {
	    		map[1][j] = 0; //경로수를 0으로 해서 계산해줘
	    	} else {
	    		map[1][j] = map[1][j-1];
	    	}
	    }	
	    

        // 5. 나머지 경로 계산 (동적 프로그래밍)
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= m; j++) {
                
                // 물웅덩이는 경로 수를 0으로 설정
                if (map[i][j] == -1) {
                    map[i][j] = 0;
                } else {
                    // 위쪽 칸에서 오는 경로 더하기
                    if (map[i - 1][j] != -1) {
                        map[i][j] += map[i - 1][j];
                    }
                    // 왼쪽 칸에서 오는 경로 더하기
                    if (map[i][j - 1] != -1) {
                        map[i][j] += map[i][j - 1];
                    }
                    // MOD 연산 적용 (큰 수 방지)
                    map[i][j] %= MOD;
                    for (int[] row : map) {
                        System.out.println(Arrays.toString(row));
                    }
                    System.out.println();
                }
            }
        }

        // 6. 결과 출력 (학교까지 갈 수 있는 최단 경로의 수)
        System.out.println("학교까지 갈 수 있는 최단 경로의 수: " + map[n][m]);

    }
}