class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int arrCopy[]= arr.clone();
        Arrays.sort(arrCopy);
        HashMap<Integer, Integer>rankMap= new HashMap<>();
        int rank= 1;

        for(int val: arrCopy){
            if(!rankMap.containsKey(val)){
                rankMap.put(val, rank);
                rank++;
            }
        }
        int result[]= new int[arr.length];
        for(int i=0; i<arr.length; i++){
            result[i]= rankMap.get(arr[i]);
        }
        return result;
    }
}