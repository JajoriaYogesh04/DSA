public class Power{
    public static int powerOne(int base, int exp){
        if(exp==0){
            return 1;
        }
        return base*powerOne(base, exp-1);
    }
    public static int powerTwo(int base, int exp){
        if(exp==0){
            return 1;
        }
        int halfPowerSquare= powerTwo(base, exp/2)*powerTwo(base, exp/2);
        if(exp%2!=0){
            return halfPowerSquare*base;
        }
        return halfPowerSquare;
    }  
    public static void main(String args[]){
        int base= 2;
        int exp= 10;
        System.out.println(powerOne(base, exp));
        System.out.println(powerTwo(base, exp));
    }
}