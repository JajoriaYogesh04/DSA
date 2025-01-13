



class Solution {
    class Jobs{
        int id;
        int deadline;
        int profit;
        Jobs(int id, int deadline, int profit){
            this.id= id;
            this.deadline= deadline;
            this.profit= profit;
        }
    }
    public ArrayList<Integer> JobSequencing(int[] id, int[] deadline, int[] profit) {
        // code here..
        ArrayList<Jobs> arr= new ArrayList<>();
        int n= id.length;
        for(int i=0; i<n; i++){
            arr.add(new Jobs(id[i], deadline[i], profit[i]));
        }
        Collections.sort(arr, (a,b)->{
            return a.deadline-b.deadline;
        });
        PriorityQueue<Jobs> pq= new PriorityQueue<>((a,b)->a.profit-b.profit);
        for(int i=0; i<arr.size(); i++){
            if(arr.get(i).deadline>pq.size()){
                pq.add(arr.get(i));
            }
            else if(arr.get(i).deadline==pq.size()){
                if(arr.get(i).profit>pq.peek().profit){
                    pq.poll();
                    pq.add(arr.get(i));
                }
            }
        }
        int size= pq.size();
        int pro= 0;
        while(!pq.isEmpty()){
            pro+=pq.remove().profit;
        }
        ArrayList<Integer> result= new ArrayList<>();
        result.add(size);
        result.add(pro);
        return result;
    }
}