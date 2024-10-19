public class Solution {
	public static String isPrime(int num) {
		if(num<=1){
			return "NO";
		}
		if(num>2 && num%2==0){
			return "NO";
		}
		for(int i=3; i<=Math.sqrt(num); i+=2){
			if(num%i==0){
				return "NO";
			}
		}
		return "YES";
	}
}