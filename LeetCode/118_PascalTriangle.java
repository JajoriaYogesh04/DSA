class Solution {
    public List<Integer> generateRow(int row){
        ArrayList<Integer> list= new ArrayList<>();
        int ans= 1;
        list.add(ans);
        for(int col=1; col<row; col++){
            ans= ans*(row-col);
            ans= ans/col;
            list.add(ans);
        }
        return list;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle= new ArrayList<>();
        for(int i=0; i<numRows; i++){
            triangle.add(generateRow(i+1));
        }
        return triangle;
    }
}