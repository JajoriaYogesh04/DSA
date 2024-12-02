

class Solution {

    void printSquare(int n) {
        // code here
        StringBuilder sb= new StringBuilder();
        for(int i=0; i<n; i++){
            sb.append("* ");
        }
        String str= sb.toString();
        for(int i=0; i<n; i++){
            System.out.println(str);
        }
    }
}