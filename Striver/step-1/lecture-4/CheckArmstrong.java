import java.util.*;
public class Main {
	public static int armstrong(int num){
		int n= num, m= num;
		int digits= 0;
		while(n>0){
			digits++;
			n/=10;
		}
		int sum= 0;
		while(m>0){
			int digit= m%10;
			sum+=Math.pow(digit, digits);
			m/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		if(num==armstrong(num)){
			System.out.print(true);
		}
		else{
			System.out.print(false);
		}
	}
}
