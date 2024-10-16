package level1;

import java.util.Arrays;

//		System.out.println(commands[0][0]);//2
//		System.out.println(commands[0][1]); //5
//		System.out.println(commands[0][2]);//3
//		
//		
//		System.out.println(commands[1][0]);//4
//		System.out.println(commands[1][1]); //4
//		System.out.println(commands[1][2]);//1


//		System.out.println(commands[2][0]);//1
//		System.out.println(commands[2][1]); //7
//		System.out.println(commands[2][2]);//3
// 		i : 0 , 1, 2
//		j : 0 , 1, 2

public class d241012_K번째수_정렬 {
	public static void main(String[] args) {

		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		int[] answer = new int[commands.length];

		
        //변수 선언 후 재료 준비
        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];  // 시작 인덱스 (1-based index)
            int end = commands[i][1];    // 끝 인덱스 (1-based index)
            int kNum = commands[i][2];   // K번째 수

            // 1) 자를 배열의 크기를 계산하여 동적으로 subArray 생성
            int[] subArray = new int[end - start + 1]; // 4칸 => start~ end까지 자른 값들을 저장할 값들.

            
            // 2) array 배열에서 start-1부터 end까지 값을 subArray로 복사
            for (int j = 0; j < subArray.length; j++) {
                subArray[j] = array[start - 1 + j]; //1-based-index 맞춰줘야해서
                System.out.println("[i][j]는 : " + "["+i+"]" + "["+j+"] => " + subArray[j]);
            }
            System.out.println();
            
            // 3)자른 배열을 정렬            
            System.out.println("소팅 전 : " + Arrays.toString(subArray));
            Arrays.sort(subArray);
            System.out.println("소팅 후 : " + Arrays.toString(subArray));

            
            
            // 4)K번째 수 찾기 (kNum은 1-based index이므로 kNum - 1)
            answer[i] = subArray[kNum - 1]; //i=0일때, 241  i=1일때 441
            System.out.println("knum은 " + answer[i]);
            System.out.println("----------------------------");
        }

        // 결과 출력
        System.out.println(Arrays.toString(answer));
    }
}


/*
	Arrays.copyOfRange(originalArray, start, end);
	
	originalArray: 복사할 원본 배열.
	start: 복사할 시작 인덱스 (0-based index).
	end: 복사할 끝 인덱스 (0-based index, 이 인덱스는 포함되지 않습니다).
*/

		
//		System.out.println(commands.length);
//        //1) 변수 선언 후 재료 준비
//        for (int i = 0; i < commands.length; i++) {
//            int start = commands[i][0];  // 시작 인덱스 (1-based index)
//            int end = commands[i][1];    // 끝 인덱스 (1-based index)
//            int kNum = commands[i][2];   // K번째 수
//
//            // 자를 배열의 크기를 계산하여 동적으로 subArray 생성
//            int[] subArray = new int[end - start + 1]; // 4칸 => start~ end까지 자른 값들을 저장할 값들.
//
//            
//            // 2) array 배열에서 start-1부터 end까지 값을 subArray로 복사
//            subArray = Arrays.copyOfRange(array, start-1, end);
//            System.out.println("subArray : " + Arrays.toString(subArray));
//            
//            
//            
//            // 3)자른 배열을 정렬            
//            System.out.println("소팅 전 : " + Arrays.toString(subArray));
//            Arrays.sort(subArray);
//            System.out.println("소팅 후 : " + Arrays.toString(subArray));
//
//            
//            
//            // 4)K번째 수 찾기 (kNum은 1-based index이므로 kNum - 1)
//            answer[i] = subArray[kNum - 1]; //i=0일때, 241  i=1일때 441
//            System.out.println("knum은 " + answer[i]);
//            System.out.println("----------------------------");
//        }
//
//        // 결과 출력
//        System.out.println(Arrays.toString(answer));
//    }
//}

