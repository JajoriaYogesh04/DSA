public class FindSubsets {
    public static void findSubsets(String str, String ans, int i){
        //basecase
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");    
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        //recursion
        findSubsets(str, ans+str.charAt(i), i+1);           //yes
        findSubsets(str, ans, i+1);                         //no
    }
    public static void main(String args[]){
        String str= "abc";
        String ans= "";
        findSubsets(str, ans, 0);
    }
}