public class Recursion {
    public static int factorial(int n){
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int sumN(int n){
        if(n==0){
            return 0;
        }
        return n+sumN(n-1);
    }
    public static int fabonacci(int n){
        if(n==0 || n==1){
            return n;
        }
        return fabonacci(n-1)+fabonacci(n-2);
    }
    public static void main(String args[]){
        int n=7;
        System.out.println(factorial(n));
        System.out.println(sumN(n));
        System.out.println(fabonacci(n));
    }
}