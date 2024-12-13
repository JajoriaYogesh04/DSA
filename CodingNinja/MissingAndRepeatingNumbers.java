public class Solution {
    public static int[] findMissingRepeatingNumbers(int []a) {
        // Write your code here
        int n= a.length;
        int xr=0;
        for(int i=1; i<=n; i++){
            xr^=a[i-1];
            xr^=i;
        }
        int bitNo=0;
        while(true){
            if((xr & (1<<bitNo)) != 0){
                break;
            }
            bitNo++;
        }
        int zero=0;
        int one= 0;
        for(int i=0; i<n; i++){
            if((a[i] & (1<<bitNo))==0){
                zero^=a[i];
            }
            else{
                one^=a[i];
            }
        }
        for(int i=1; i<=n; i++){
            if((i & (1<<bitNo))==0){
                zero^=i;
            }
            else{
                one^=i;
            }
        }
        int count=0;
        for(int i=0; i<n; i++){
            if(a[i]==zero){
                count++;
            }
        }
        int x=-1;
        int y=-1;
        if(count==2){
            x= zero;
            y= one;
        }
        else if(count==0){
            x= one;
            y= zero;
        }
        return new int[]{x, y};

    }
}