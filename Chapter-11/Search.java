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
    public static int BinarySearchRow(int arr[], int key){
        int start= 0;
        int end= arr.length-1;
        int mid=0;
        while(start<=end){
            mid= (start+end)/2;
            if(key==arr[mid]){
                return mid;
            }
            if(key>=arr[mid]){
                start= mid+1;
            }
            else{
                end= mid-1;
            }
        }
        return -1;
    }
    public static void BinarySearch(int arr[][], int key){
        for(int i=0; i<arr.length; i++){
            int colIdx= BinarySearchRow(arr[i], key);
            if(colIdx!=-1){
                System.out.print("("+i+","+colIdx+")");
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
        int brr[]= {1,2,3,4};
        int key= 39;
        // brutForce(arr, key);
        // BinarySearchRow(brr, 4);
        BinarySearch(arr, key);
    }
}