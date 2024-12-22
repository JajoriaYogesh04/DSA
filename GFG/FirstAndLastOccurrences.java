// User function Template for Java

class GFG {
    int firstOccurrence(int arr[], int x){
        int si= 0;
        int ei= arr.length-1;
        int fo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]==x){
                fo= mi;
                ei= mi-1;
            }
            else if(arr[mi]<x){
                si= mi+1;
            }
            else{
                ei= mi-1;
            }
        }
        return fo;
    }
    int lastOccurrence(int arr[], int x){
        int si= 0;
        int ei= arr.length-1;
        int lo= -1;
        while(si<=ei){
            int mi= si+(ei-si)/2;
            if(arr[mi]==x){
                lo= mi;
                si= mi+1;
            }
            else if(arr[mi]>x){
                ei= mi-1;
            }
            else{
                si= mi+1;
            }
        }
        return lo;
    }
    ArrayList<Integer> find(int arr[], int x) {
        // code here
        ArrayList<Integer> list= new ArrayList<>();
        list.add(firstOccurrence(arr, x));
        list.add(lastOccurrence(arr, x));
        return list;
    }
}