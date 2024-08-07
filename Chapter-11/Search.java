public class Search{
    public static void brutForce(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j]==key){
                    System.out.print("("+i+","+j+")");
                }
            }
        }
    }
    public static void main(String args[]){
        int arr[][]= {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };
        int key= 37;
        brutForce(arr, key);
    }
}