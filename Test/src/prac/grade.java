package prac;

import java.util.Scanner;

public class grade {
	public static void main(String[] args) {
		
//		char grade = 'F';
		
		System.out.println("성적을 입력해주세요!");
		Scanner sc = new Scanner(System.in);
        
		String input = sc.next(); // 문자열을 입력받음
        char grade = input.charAt(0); // 첫 번째 문자를 char로 추출		
        /*
         * 성적을 입력해주세요!
			Akjkjkjkj	
			91~100점 사이 입니다.
         * 
         * 
         * */
        
		switch (grade) {
		case 'A':
			System.out.println("91~100점 사이 입니다.");
			break;
		case 'B':
			System.out.println("91~100점 사이 입니다.");
			break;
		case 'C':
			System.out.println("91~100점 사이 입니다.");
			break;
		case 'D':
			System.out.println("91~100점 사이 입니다.");
			break;
		default:
			break;
		}
	}
}
