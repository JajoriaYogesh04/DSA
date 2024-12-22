class Solution {
    public String getSmallestString(int n, int k) {
        char str[]= new char[n];
        for(int i=0; i<n; i++){
            str[i]='a';
            k--;
        }
        for(int i=n-1; i>=0; i--){
            if(k>=0){
                if(k>=25){
                    str[i]='z';
                    k-=25;
                }
                else{
                    str[i]=(char)(97+k);
                    k-=k;
                }
            }
            else{
                break;
            }
        }
        return new String(str);
    }
}