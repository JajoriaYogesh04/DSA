


class Solution {
    public static ArrayList<Integer> rearrangeQueue(int N, Queue<Integer> q) {
        // code here
        Queue<Integer> q2= new LinkedList<>();
        for(int i=0; i<N/2; i++){
            q2.add(q.remove());
        }
        while(!q2.isEmpty()){
            q.add(q2.remove());
            q.add(q.remove());
        }
        ArrayList<Integer> list= new ArrayList<>();
        while(!q.isEmpty()){
            list.add(q.remove());
        }
        return list;
    }
}
        