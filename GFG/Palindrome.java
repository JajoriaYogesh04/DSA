

//User function Template for Java

class Solution
{
    public String is_palindrome(int n)
    {
        // Code here
        int rev= 0;
        int num= n;
		while(n>0){
		    rev= rev*10+(n%10);
		    n/=10;
		}
		return num==rev ? "Yes":"No";
    }
}