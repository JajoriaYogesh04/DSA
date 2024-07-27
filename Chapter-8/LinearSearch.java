import java.util.*;

public class LinearSearch {
    public static int linearSearch(int arr[], int n){
        for(int i=0; i<arr.length; i++){
            if(arr[i]==n){
                return i;
            }
        }
        return -1;
    }

    public static int linearSearchMenu(String menu[], String item){
        for(int i=0; i<menu.length; i++){
            if(menu[i].equals(item)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        
        // int arr[]= {2,4,6,8,10,12,14,16,18,20};
        // System.out.print("Enter element you want to search: ");
        // // int n= sc.nextInt();
        // int index= linearSearch(arr, n);
        // if(index==-1){
        //     System.out.println("NOT FOUND");
        // }
        // else{
        //     System.out.println("Index: "+index);
        // }

        String menu[]= {"Samosa", "Kachori", "Pizza", "Burger", "Namkeen"};
        System.out.print("You want: ");
        String item= sc.nextLine();
        int index= linearSearchMenu(menu, item);
        if(index==-1){
            System.out.println("NOT FOUND");
        }
        else{
            System.out.println("Index: "+index);
        }

    }
}