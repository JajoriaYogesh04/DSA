public class Power{
    public static int power(int base, int exp){
        if(exp==0){
            return 1;
        }
        return base*power(base, exp-1);
    }
    public static void main(String args[]){
        int base= 2;
        int exp= 10;
        System.out.println(power(base, exp));
    }
}