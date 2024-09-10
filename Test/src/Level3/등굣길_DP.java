package Level3;

import java.util.Arrays;

// DP : 동적프로그래밍!
// 기억 하기 알고리즘
// 중요! 이전의 결과값을 활용하는 것이다!
/*
 * 계속되는 폭우로 일부 지역이 물에 잠겼습니다. 물에 잠기지 않은 지역을 통해 학교를 가려고 합니다. 집에서 학교까지 가는 길은 m x n 크기의 격자모양으로 나타낼 수 있습니다.
아래 그림은 m = 4, n = 3 인 경우입니다.
가장 왼쪽 위, 즉 집이 있는 곳의 좌표는 (1, 1)로 나타내고 가장 오른쪽 아래, 즉 학교가 있는 곳의 좌표는 (m, n)으로 나타냅니다.

격자의 크기 m, n과 물이 잠긴 지역의 좌표를 담은 2차원 배열 puddles이 매개변수로 주어집니다. 오른쪽과 아래쪽으로만 움직여 집에서 학교까지 갈 수 있는 최단경로의 개수를 1,000,000,007로 나눈 나머지를 return 하도록 solution 함수를 작성해주세요.

제한사항
격자의 크기 m, n은 1 이상 100 이하인 자연수입니다.
m과 n이 모두 1인 경우는 입력으로 주어지지 않습니다.
물에 잠긴 지역은 0개 이상 10개 이하입니다.
집과 학교가 물에 잠긴 경우는 입력으로 주어지지 않습니다.
입출력 예
m	n	puddles	return
4	3	[[2, 2]]	4
 * */
//

public class 등굣길_DP {
	private static int[][] memo; // 메모이제이션 배열
	private static int[][] map; // 지도 배열
	private static final int MOD = 1000000007;

	// 경로수를 계산하는 함수(메모이제이션)
	private static int findRoutes(int m, int n) {
		// 웅덩이거나 범위를 벗어난 경우 경로 수는 0
		// 1인덱스로 처리하기때문에 남은 배열 처리
		if (m < 1 || n < 1 || map[n][m] == -7) {
			return 0;
		}

		// 출발점 설정
		if (m == 1 && n == 1) {
			return 1;
		}

		// 이미 계산된 값이 있으면 반환!하기!
		if (memo[n][m] != -7) {
			return memo[n][m];
		}

		// 메모이제이션 배열에 경로수를 저장하면서 위, 왼쪽에서 오는 결과값을 더함.
		memo[n][m] = (findRoutes(m - 1, n) + findRoutes(m, n - 1)) % MOD;

		return memo[n][m];
	}

	public static void main(String[] args) {
		int n = 3; //행
		int m = 4; //열

		int[][] puddles = { { 2, 2 } };
		// 1) 계산값을 정해줄 배열 생성
		// 2) map에 웅덩이 추가

		// 1)
		// 1 index!
		// -7은 아직 계산되지 않음!을 의미
		// 배열을 7로 일단 다 채우기!
		memo = new int[n + 1][m + 1]; //1
		for (int[] row : memo) {
			Arrays.fill(row, -7); // fill 채우는 함수

			// 2)
			map = new int[n + 1][m + 1]; // 4*5 표를 만듬
			for (int[] puddle : puddles) {
				
				System.out.println(Arrays.toString(puddle));
				map[puddle[1]][puddle[0]] = -7;
				System.out.print(" puddle : " + puddle[1] + puddle[0]);
//				System.out.print(Arrays.deepToString(map));
			}

			System.out.println(findRoutes(m, n) % MOD);

		}

	}

}
