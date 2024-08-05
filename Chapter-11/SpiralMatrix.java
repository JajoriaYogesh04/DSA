public class SpiralMatrix {
    public static void printArray(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void spiralMatrix(int arr[][]){
        int rowStart= 0;
        int colStart= 0;
        int rowEnd= arr.length-1;
        int colEnd= arr[0].length-1;
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int j=colStart; j<=colEnd; j++){
                System.out.print(arr[rowStart][j]+" ");
            }
            for(int j=rowStart+1; j<=rowEnd; j++){
                System.out.print(arr[j][colEnd]+" ");
            }
            for(int j=colEnd-1; j>=colStart; j--){
                System.out.print(arr[rowEnd][j]+" ");
            }
            for(int j=rowEnd-1; j>=rowStart+1; j--){
                System.out.print(arr[j][colStart]+" ");
            }
            colStart++;
            colEnd--;
            rowStart++;
            rowEnd--;
            
        }
    }
    public static void main(String args[]){
        int martix[][]= {
            {1,2,3,4,5},
            {6,7,8,9,10},
            {11,12,13,14,15},
            {16,17,18,19,20},
            {21,22,23,24,25}
        };
        printArray(martix);
        spiralMatrix(martix);
    }
}