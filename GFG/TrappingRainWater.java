

class Solution {
    public int trappingWater(int arr[]) {
        // code here
        int vol=0;
        Stack<Integer> s= new Stack<>();
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