public class PracticeQuestion3{
    public static int mergeSort(int arr[], int start, int end){
        int invCount= 0;
        if(end>start){
            int mid= start+(end-start)/2;
            invCount= mergeSort(arr, start, mid);
            invCount+=mergeSort(arr, mid+1, end);
            invCount+=merge(arr, start, end, mid);
        }
        return invCount;
    }
    public static int merge(int arr[], int si, int ei, int mid){
        int invCount= 0;
        int tempArr[]= new int[ei-si+1];
        int i=si;
        int j= mid+1;
        int k= 0;
        while(i<=mid && j<=ei){
            if(arr[i]<=arr[j]){
                tempArr[k]= arr[i];
                i++;
            }
            else{
                tempArr[k]= arr[j];
                j++;
                invCount+=(mid-i+1);
            }
            k++;
        }
        while(i<=mid){
            tempArr[k]= arr[i];
            i++;
            k++;
        }
        while(j<=ei){
            tempArr[k]= arr[j];
            j++;
            k++;
        }
        for(int l=0; l<tempArr.length; l++){
            arr[si+l]= tempArr[l];
        }
        return invCount;
    }
    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[]= {2,4,1,3,5};
        int start= 0;
        int end= arr.length-1;
        int count= mergeSort(arr, start, end);
        printArray(arr);
        System.out.println(count);
    }
}