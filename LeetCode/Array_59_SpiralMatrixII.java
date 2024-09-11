class Solution {
    public int[][] generateMatrix(int n) {
        int rowStart= 0;
        int rowEnd= n-1;
        int colStart= 0;
        int colEnd= n-1;
        int arr[][]= new int[n][n];
        int num =1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i= colStart; i<=colEnd; i++){
                arr[rowStart][i]= num;
                num++;
            }
            rowStart++;
            for(int i= rowStart; i<=rowEnd; i++){
                arr[i][colEnd]= num;
                num++;
            }
            colEnd--;
            if(rowStart<=rowEnd){
                for(int i= colEnd; i>=colStart; i--){
                    arr[rowEnd][i]= num;
                    num++;
                }
                rowEnd--;
            }
            if(colStart<=colEnd){
                for(int i= rowEnd; i>=rowStart; i--){
                    arr[i][colStart]= num;
                    num++;
                }
                colStart++;
            }   
        } 
        return arr;
    }
}