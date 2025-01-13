

class Solution {
    public String FirstNonRepeating(String s) {
        // code here
        StringBuilder sb= new StringBuilder();
        int arr[]= new int[26];
        Queue<Character> q= new LinkedList<>();
        for(int i=0; i<s.length(); i++){
            arr[s.charAt(i)-'a']++;
            q.add(s.charAt(i));
            while(!q.isEmpty() && arr[q.peek()-'a']>1){
                q.remove();
            }
            if(q.isEmpty()){
                sb.append("#");
            }
            else{
                sb.append(q.peek());
            }
        }
        return sb.toString();
    }
}