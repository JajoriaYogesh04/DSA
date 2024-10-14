import java.util.*;
public class Solution {
	public static int fibonacci(int n){
		if(n==0||n==1){
			return n;
		}
		return fibonacci(n-1)+fibonacci(n-2);
	}

	public static void main(String[] args) {
		
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		System.out.print(fibonacci(n));
		
	}

}
