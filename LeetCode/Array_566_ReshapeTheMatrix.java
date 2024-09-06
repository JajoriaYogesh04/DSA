class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int newMat[][]= new int[r][c];
        int i=0;
        int j=0;
        if(mat.length*mat[0].length != r*c){
            return mat;
        }
        else{
            for(int m=0; m<mat.length; m++){
                for(int n=0; n<mat[0].length; n++){
                    newMat[i][j]=mat[m][n];
                    j++;
                    if(j==c){
                        j=0;
                        i++;
                    }     
                }   
            }
        }
        return newMat;
    }
}