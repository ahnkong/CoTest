package level1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;


//객체 생성
class PokemonPick {
  private int[] nums;
  private int maxTypes;

  //생성자 수정 (인자에서 배열만 가져오는 걸 선택, maxType은 한번 연산이 필요하기 때문에, 인자로 그냥 받아오게 될경우 복잡해짐)
  public PokemonPick(int[] nums) {
      this.nums = nums;
      this.maxTypes = calculateTypes(); // nums배열에서 한번 연산된 후 maxtypes를 결정할 수 있댜
  }
  
	public int[] getNums() {
		return nums;
	}


	public void setNums(int[] nums) {
		this.nums = nums; //테스트 케이스가 여러개일 경우에 배열이 바뀌면서, maxType값도 바뀐다. 
      this.maxTypes = calculateTypes(); //case 1 = 2 => 그래서  = calculateTypes가 필요
	}



	public int getMaxTypes() {
		return maxTypes;
	}



	public void setMaxTypes(int maxTypes) {
		this.maxTypes = maxTypes;
	}


	//{3, 1, 2, 3}
	private int calculateTypes() {
      // 가져갈수 잇는 폰켓몬을 가져갈 수 있음
      int pickNum = nums.length / 2;

	    // HashMap을 사용해 폰켓몬 종류별로 등장 횟수를 저장
	    HashMap<Integer, Integer> pokemonCnt = new HashMap<>();
	    for (int temp : nums) {
	    	if(pokemonCnt.containsKey(temp)) {
	    		pokemonCnt.put(temp, pokemonCnt.get(temp)+1);
	    	}else {
	    		pokemonCnt.put(temp, 1);
	    	}
	    }	
      // 고를 수 있는 폰켓몬 종류의 최댓값은
      // 종류의 개수와 N/2 중에서 더 작은 값이 됨
	    int answer = 0;
	    if(pokemonCnt.size() >= nums.length/2) {
	    	answer = nums.length/2;
	    } else {
	    	answer = pokemonCnt.size();
	    }
	    return answer;
	    }
}



public class 폰켓몬class구현 {
    public static void main(String[] args) {
        // Test case 1
        int[] nums1 = {3, 1, 2, 3};
        PokemonPick select1 = new PokemonPick(nums1);
        System.out.println("최대로 선택할 수 있는 폰켓몬의 종류는 " + select1.getMaxTypes() +"개 입니다!"); // 결과는 2
        
        // Test case 2
        int[] nums2 = {3, 3, 3, 2, 2, 4};
        PokemonPick select2 = new PokemonPick(nums2);
        System.out.println("최대로 선택할 수 있는 폰켓몬의 종류는 " + select2.getMaxTypes() +"개 입니다!"); // 결과는 2
        
        // Test case 3
        int[] nums3 = {3, 3, 3, 2, 2, 2};
        PokemonPick select3 = new PokemonPick(nums3);
        System.out.println("최대로 선택할 수 있는 폰켓몬의 종류는 " + select3.getMaxTypes() +"개 입니다!"); // 결과는 2
        
        

    }
}


//        Scanner sc = new Scanner(System.in);
//        // 배열의 크기 입력
//        System.out.print("배열 크기를 입력하세요: ");
//        int n = sc.nextInt();
//
//        // 배열 생성
//        int[] arr = new int[n];
//
//        // 배열 요소 입력
//        System.out.println(n + "개의 정수를 입력하세요:");
//        for (int i = 0; i < n; i++) {
//            arr[i] = sc.nextInt(); // 정수 입력받아 배열에 저장
//        }
//
//        // 배열 출력
//        System.out.println("입력된 배열:");
//        for (int num : arr) {
//            System.out.print(num + " ");
//        }
//        sc.close(); // Scanner 객체 닫기