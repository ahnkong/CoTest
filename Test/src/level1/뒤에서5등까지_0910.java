package level1;
//8분!
import java.util.Arrays;

/*
 * 정수로 이루어진 리스트 num_list가 주어집니다, num_list에서 가장 작은 5개의 수를 오름차순으로 담은 리스트를 
return하도록 solution 함수를 완성해주세요,

	제한사항
6 ≤ num_list의 길이 ≤ 30
1 ≤ num_list의 원소 ≤ 100

입출력 예
num_list	result
[12, 4, 15, 46, 38, 1, 14]	[1, 4, 12, 14, 15]
 * */
public class 뒤에서5등까지_0910 {
	public static void main(String[] args) {
		
		
	int[] num_list = {12,4,15,46,38,1,14};
	int[] answer = new int[5]; //5개만 리턴하면 되니가 5칸짜리만 생성
	
	
	
	Arrays.sort(num_list);//배열을 먼저 소팅!
	
	System.out.println(Arrays.toString(num_list));
	
	for(int i = 0; i < answer.length ; i++) {
		answer[i] = num_list[i]; 
		System.out.println("answer["+ i + "] :" + answer[i]);
	}
	
	System.out.println(Arrays.toString(answer)); //=> [1, 4, 12, 14, 15]
	}	 
	
}









