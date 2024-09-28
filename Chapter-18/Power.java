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
    public static int powerThree(int base, int exp){
        if(exp==0){
            return 1;
        }
        int halfPower= powerThree(base, exp/2);
        if(exp%2!=0){
            return halfPower * halfPower * base;
        }
        return halfPower * halfPower;
    }
    public static void main(String args[]){
        int base= 2;
        int exp= 10;
        System.out.println(powerOne(base, exp));
        System.out.println(powerTwo(base, exp));
        System.out.println(powerThree(base, exp));
    }
}