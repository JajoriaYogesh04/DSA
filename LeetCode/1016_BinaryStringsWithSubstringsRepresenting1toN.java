class Solution {
    public boolean queryString(String s, int n) {
        Queue<String> q= new LinkedList<>();
        q.add("1");
        for(int i=0; i<n; i++){
            String top= q.remove();
            if(!s.contains(top)){
                return false;
            }
            q.add(top+"0");
            q.add(top+"1");
        }
        return true;
    }
}