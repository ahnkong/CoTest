package level1;

import java.util.ArrayList;
import java.util.Arrays;

public class d241009_카드뭉치 {
	public static void main(String[] args) {
		
	String[] cards1 = {"i", "drink", "water"};
	String[] cards2 = {"want", "to"};
	String[] goal = {"i", "want", "to", "drink", "water"};
	boolean res = true;
    String answer = "";
	
//	ArrayList<String> deck1 = new ArrayList<>(Arrays.asList(cards1)); //Arrays를 List로 변환시킬래! 라는 거! 
//	ArrayList<String> deck2 = new ArrayList<>(Arrays.asList(cards2));
	
    ArrayList<String> deck1 = new ArrayList<>();
    for( String card : cards1 ) {
    	deck1.add(card);
    	System.out.println("deck1 입니다. " + deck1);
    }
    
    System.out.println("------------------");
    
    
    ArrayList<String> deck2 = new ArrayList<>();
    for( String card : cards2 ) {
    	deck2.add(card);
    	System.out.println("deck2 입니다. " + deck2);
    }
    
	
    System.out.println("------------------");
    
    //goal배열의 값을 deck1, deck2와 비교하는 조건문
    System.out.println("처음의 deck1 입니다. " + deck1);
    System.out.println("처음의 deck2 입니다. " + deck2);
    System.out.println();
	for(String word : goal) {
		
		if(!deck1.isEmpty() && deck1.get(0).equals(word)) { // 덱스1에서 word 탐색
			deck1.remove(0);   // goal의 word가 deck1에 있을때, 삭제를 해주고, 뒤에 인덱스 요소를 앞으로 끌고 옴
			System.out.println(word+"는 deck1에서 제거 : " + deck1);
			
		} else if(!deck2.isEmpty() && deck2.get(0).equals(word)) { // 덱스2에서 word탐색
			deck2.remove(0);
			System.out.println(word+"는 deck2에서 제거 : " +deck2);

		} else {
			res = false; // 두덱에서 현재 word(단어)를 찾을 수 없으면, false반환!
			System.out.println("단어를 포함한 deck이 없습니다.");
			break;
		}

		
	}
	
    if(res == true){
        answer = "Yes";
    } else{
        answer = "No";
    }
	System.out.println(res);
	
	}
}
