class Solution {
    private List<String> convert(String sentence){
        sentence+=" ";
        List<String> ans= new ArrayList<>();
        StringBuilder word= new StringBuilder("");
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)==' '){
                ans.add(word.toString());
                word.setLength(0);
            }
            else{
                word.append(sentence.charAt(i));
            }
        }
        return ans;
    }
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if(sentence1.length()<sentence2.length()){
            String temp= sentence1;
            sentence1= sentence2;
            sentence2= temp;
        }
        List<String> vx= convert(sentence1);
        List<String> vy= convert(sentence2);
        int l= 0;
        for(int i=0; i<vy.size(); i++){
            if(vx.get(i).equals(vy.get(i))){
                l++;
            }
            else{
                break;
            }
        }
        int ind= vx.size()-1;
        int r= vy.size();
        for(int i=vy.size()-1; i>=0; i--){
            if(vy.get(i).equals(vx.get(ind))){
                ind--;
                r= i;
            }
            else{
                break;
            }
        }
        return r<=l;
    }
}