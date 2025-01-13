

// class Solution {
//     static ArrayList<Integer> leaders(int arr[]) {
//         // code here
//         ArrayList<Integer> list= new ArrayList<>();
//         for(int i=0; i<arr.length-1; i++){
//             boolean lead= true;
//             for(int j=i+1; j<arr.length; j++){
//                 if(arr[j]>arr[i]){
//                     lead= false;
//                     break;
//                 }
//             }
//             if(lead==true){
//                 list.add(arr[i]);
//             }
//         }
//         list.add(arr[arr.length-1]);
//         return list;
//     }
// }






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
