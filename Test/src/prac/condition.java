package prac;

import java.util.Scanner;

public class condition {
	public static void main(String[] args) {
		
//		int myAge = 19;
		
		Scanner sc = new Scanner(System.in); 
		System.out.println("학생 할인을 위한 확인이 필요합니다. 나이를 입력해주세요!");
		int myAge = sc.nextInt();
		
		if(myAge == 19) {
			System.out.println("19살 입니다.");
		}
		if(myAge != 19) {
			System.out.println("19살이 아닙니다.");
		}
		if(myAge > 19) {
			System.out.println("성인입니다.");
		}
		if(myAge <= 19) {
			System.out.println("학생입니다.");
		}
//		System.out.println(myAge);
	}
}
