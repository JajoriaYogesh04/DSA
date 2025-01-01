class Solution {
    public ArrayList<ArrayList<String>> anagrams(String[] arr) {
        // code here
        ArrayList<ArrayList<String>> ans= new ArrayList<>();
        HashMap<String, ArrayList<String>> map= new HashMap<>();
        for(int i=0; i<arr.length; i++){
            String str= arr[i];
            char[] charr= str.toCharArray();
            Arrays.sort(charr);
            String sortstr= String.valueOf(charr);
            if(!map.containsKey(sortstr)){
                map.put(sortstr, new ArrayList<>());
            }
            map.get(sortstr).add(str);
        }
        return new ArrayList(map.values());
    }
}