public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int rep= -1;
        int mis= -1;
        for(int i=1; i<=a.length; i++){
            int count= 0;
            for(int j=0; j<a.length; j++){
                if(a[j]==i){
                    count++;
                }
            }
            if(count==2){
                rep= i;
            }
            else if(count==0){
                mis= i;
            }
            if(count==2 && mis==0){
                break;
            }
        }
        return new int[]{rep, mis};
    }
}