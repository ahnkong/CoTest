package level1;
//약수는 n을 나누었을때, 나머지가 0인 것을 의미한다!
public class d241001_약수의합 {
	public static void main(String[] args) {
		int n = 12;
		int answer = 0;
        int temp = 0;      
     
        
        //일반 for문으로!
//        for( int i = 1; i <= n ; i++){
//            if ( n%i == 0){
//                temp += i;
//            }
//        }
        
        
        
        //삼항연산자로 가능??
        for( int i = 1; i <= n ; i++){
        	temp += (n % i == 0) ? i : 0 ;
        }
        
        
 
        System.out.println(temp);
		
	}
}
