

// User function Template for Java

class Solution {
    // Function to find two elements in array
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        int n= arr.length;
        int xr=0;
        for(int i=1; i<=n; i++){
            xr^=arr[i-1];
            xr^=i;
        }
        int bitno=0;
        while(true){
            if((xr & (1<<bitno))!=0){
                break;
            }
            bitno++;
        }
        int zero=0;
        int one=0;
        for(int i=1; i<=n; i++){
            if((arr[i-1] & (1<<bitno))==0){
                zero^=arr[i-1];
            }
            else{
                one^=arr[i-1];
            }
            if((i & (1<<bitno))==0){
                zero^=i;
            }
            else{
                one^=i;
            }
        }
        int count=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]==zero){
                count++;
            }
        }
        ArrayList<Integer> list= new ArrayList<>();
        if(count==2){
            list.add(zero);
            list.add(one);
        }
        else if(count==0){
            list.add(one);
            list.add(zero);
        }
        return list;
    }
}