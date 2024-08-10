public class StringCompare {
    public static void main(String args[]){
        
        String str1= "Tony";
        String str2= "Tony";
        String str3= new String("Tony");
        if(str1==str2){
            System.out.println("Same Strings");
        }
        else{
            System.out.println("Different Strings");
        }
        if(str1==str3){
            System.out.println("Same Strings");
        }
        else{
            System.out.println("Different Strings");
        }
        if(str1.equals(str3)){
            System.out.println("Same Strings");
        }
        else{
            System.out.println("Different Strings");
        }
    }
}