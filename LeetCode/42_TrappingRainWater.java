//Array Approach

class Solution {
    public int trap(int[] arr) {
        int leftMax= Integer.MIN_VALUE;
        int lmaxArr[]= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i]>=leftMax){
                leftMax=arr[i];
            }
            lmaxArr[i]= leftMax;
        }

        int rightMax= Integer.MIN_VALUE;
        int rmaxArr[]= new int [arr.length];
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i]>rightMax){
                rightMax=arr[i];
            }
            rmaxArr[i]=rightMax;
        }

        int minMax[]= new int[arr.length];
        int minElement= Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(lmaxArr[i]<rmaxArr[i]){
                minElement=lmaxArr[i];
            }
            else{
                minElement=rmaxArr[i];
            }
            minMax[i]= minElement;
        }

        int volume= 0;
        for(int i=0; i<arr.length; i++){
            volume+=(minMax[i]-arr[i])*1;
        }

        return volume;
    }
}


//Stack Approach

class Solution {
    public int trap(int[] arr) {
        Stack<Integer> s= new Stack<>();
        int vol= 0;
        for(int i=0; i<arr.length; i++){
            while(!s.isEmpty() && arr[i]>arr[s.peek()]){
                int popheight= arr[s.pop()];
                if(s.isEmpty()){
                    break;
                }
                int dist= i-s.peek()-1;
                int level= Math.min(arr[i], arr[s.peek()])-popheight;
                vol+=dist*level;
            }
            s.push(i);
        }
        return vol;
    }
}