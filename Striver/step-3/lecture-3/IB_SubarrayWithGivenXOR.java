public class Solution {
    public int solve(ArrayList<Integer> A, int B) {
        int n=A.size();
        int xor= 0;
        HashMap<Integer, Integer> map= new HashMap<>();
        map.put(xor, 1);
        int count= 0;
        for(int i=0; i<n; i++){
            xor^=A.get(i);
            int x= xor^B;
            if(map.containsKey(x)){
                count+=map.get(x);
            }
            if(map.containsKey(xor)){
                map.put(xor, map.get(xor)+1);
            }
            else{
                map.put(xor, 1);
            }
        }
        return count;
    }
}