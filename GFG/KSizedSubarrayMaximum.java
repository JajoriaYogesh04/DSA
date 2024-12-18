

// User function template for JAVA

class Solution {
    // Function to find maximum of each subarray of size k.
    public ArrayList<Integer> max_of_subarrays(int arr[], int k) {
        // Your code here
        Deque<Integer> dq= new ArrayDeque<>();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            while(!dq.isEmpty() && arr[i]>arr[dq.peekLast()]){
                dq.removeLast();
            }
            while(!dq.isEmpty() && dq.peekFirst()<i-k+1){
                dq.removeFirst();
            }
            dq.addLast(i);
            if(i>=k-1){
                list.add(arr[dq.peekFirst()]);
            }
        }
        return list;
    }
}