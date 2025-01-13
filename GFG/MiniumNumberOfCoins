

// User function Template for Java

class Solution{
    static List<Integer> minPartition(int N)
    {
        // code here
        Integer coins[]= {2000,500,200,100,50,20,10,5,2,1};
        List<Integer> list= new ArrayList<>();
        for(int i=0; i<coins.length; i++){
            while(coins[i]<=N){
                list.add(coins[i]);
                N-=coins[i];
            }
        }
        return list;
    }
}