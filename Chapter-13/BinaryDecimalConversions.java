public class BinaryDecimalConversions {
    public static void toBinary(int num){
        int i=0;
        int bin=0;
        while(num>0){
            bin+= Math.pow(10, i) * (num%2);
            num/=2;
            i++;
        }
        System.out.println(bin);
    }
    public static void toDecimal(int num){
        int dec=0;
        int i=0;
        while(num>0){
            dec += (num%10)*Math.pow(2,i);
            num/=10;
            i++;
        }
        System.out.println(dec);
    }
    public static void main(String args[]){
        int dec= 10;
        toBinary(dec);
        int bin= 101;
        toDecimal(bin);
    }
}