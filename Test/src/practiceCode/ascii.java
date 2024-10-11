package practiceCode;

public class ascii {

	public static void main(String[] args) {
		
		char ch = 'A';

		int asciiCh = (int)ch;
		
		
		System.out.println("ch형 : " + ch);
		System.out.println("ascil형 : " + asciiCh);
		System.out.println("ascii 하드 코딩 : " + (int)ch);
		System.out.println("ascii 하드 코딩 : " + (int)'A');
		
		
		
		
		System.out.println("-----------------------------------");
		
		
		int num = 77;
		char asciiCh2 = (char)num;
		
		System.out.println("num형 : " + num);
		System.out.println("ascii형 : " + asciiCh2);
		System.out.println("ascii형 하드 코딩 : " + (char)num);
		System.out.println("ascii형 하드 코딩 : " + (char)77);
		
		
	}
}
