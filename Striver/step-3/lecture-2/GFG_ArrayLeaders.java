

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        int leader= Integer.MIN_VALUE;
        int n= arr.length;
		ArrayList<Integer> ls= new ArrayList<>();
		for(int i=n-1; i>=0; i--){
			if(arr[i]>=leader){
				ls.add(arr[i]);
				leader= arr[i];
			}
		}
		int start= 0;
		int end= ls.size()-1;
		while(start<end){
			int temp= ls.get(start);
			ls.set(start, ls.get(end));
			ls.set(end, temp);
			start++;
			end--;
		}
		return ls;
    }
}