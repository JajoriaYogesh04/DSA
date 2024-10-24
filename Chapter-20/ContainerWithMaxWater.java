import java.util.ArrayList;
import java.util.Scanner;
public class ContainerWithMaxWater {
    // public static int containerWithMaxWater(ArrayList<Integer> height){
    //     int maxVol= 0;
    //     for(int i=0; i<height.size()-1; i++){
    //         for(int j=i+1; j<height.size(); j++){
    //             int start= height.get(i);
    //             int end= height.get(j);
    //             int vol= (j-i)*Math.min(start, end);
    //             maxVol= Math.max(vol, maxVol);
    //         }
    //     }
    //     return maxVol;
    // }
    public static int containerWithMaxWater(ArrayList<Integer> height){
        int i= 0;
        int j= height.size()-1;
        int maxVol= 0;
        while (i<j) {
            if(height.get(i)<=height.get(j)){
                i++;
            }
            else{
                j--;
            }
            int vol= (j-1)*(Math.min(height.get(i), height.get(j)));
            maxVol= Math.max(vol, maxVol);
        }
        return maxVol;
    }
    public static void inputArrayList(ArrayList<Integer> list, int n){
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<n; i++){
            System.out.print("Enter: ");
            list.add(sc.nextInt());
        }
        System.out.println(list);
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        ArrayList<Integer> height= new ArrayList<>();
        System.out.print("Enter Length: ");
        int len= sc.nextInt();
        inputArrayList(height, len);
        System.out.println(containerWithMaxWater(height));
    }
}