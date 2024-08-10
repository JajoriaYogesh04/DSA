
public class MyStringBuilder {
    public static void immutable(String str){
        for(char ch='a'; ch<='z'; ch++){
            str+=ch;
            System.out.println(str);
        }
    }
    public static void main(String args[]){
        // String str= "Tony";
        // immutable(str);

        StringBuilder sb= new StringBuilder("Tony");
        sb.toString();              //used for objects only
        System.out.println(sb);
        
        Character ch1= 'A';
        ch1.toString();
        System.out.println(ch1);

        Integer int1= 10;
        int1.toString();
        System.out.println(int1);
    }
}