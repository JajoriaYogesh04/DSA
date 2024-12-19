import java.util.*;
public class FractionalKnapsack{
    public static double fractionalKnapsack(int weight[], int value[], int capacity){
        double ratio[][]= new double[value.length][2];
        for(int i=0; i<ratio.length; i++){
            ratio[i][0]= i;
            ratio[i][1]= (double)value[i]/weight[i];
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        double maxValue= 0;
        for(int i=ratio.length-1; i>=0; i--){
            int idx= (int)ratio[i][0];
            if(capacity>=weight[idx]){
                maxValue+=(double)value[idx];
                capacity-=weight[idx];
            }
            else{
                maxValue+=capacity*ratio[i][1];
                break;
            }
        }
        return maxValue;
    }
    public static void main(String args[]){
        // Test case 1: Basic example
        int weight1[] = {10, 20, 30};
        int value1[] = {60, 100, 120};
        int capacity1 = 50;
        System.out.println("Test case 1 - Maximum value: " + fractionalKnapsack(weight1, value1, capacity1));

        // Test case 2: Small weights and high values
        int weight2[] = {5, 10, 15};
        int value2[] = {60, 90, 120};
        int capacity2 = 20;
        System.out.println("Test case 2 - Maximum value: " + fractionalKnapsack(weight2, value2, capacity2));

        // Test case 3: All items fit exactly
        int weight3[] = {5, 10, 15};
        int value3[] = {10, 20, 30};
        int capacity3 = 30;
        System.out.println("Test case 3 - Maximum value: " + fractionalKnapsack(weight3, value3, capacity3));

        // Test case 4: Only a fraction of one item can fit
        int weight4[] = {10, 20, 30};
        int value4[] = {60, 100, 120};
        int capacity4 = 15;
        System.out.println("Test case 4 - Maximum value: " + fractionalKnapsack(weight4, value4, capacity4));

        // Test case 5: Zero capacity
        int weight5[] = {10, 20, 30};
        int value5[] = {60, 100, 120};
        int capacity5 = 0;
        System.out.println("Test case 5 - Maximum value: " + fractionalKnapsack(weight5, value5, capacity5));

        // Test case 6: High capacity, fitting all items
        int weight6[] = {10, 20, 30};
        int value6[] = {60, 100, 120};
        int capacity6 = 100;
        System.out.println("Test case 6 - Maximum value: " + fractionalKnapsack(weight6, value6, capacity6));

        // Test case 7: Single item
        int weight7[] = {20};
        int value7[] = {100};
        int capacity7 = 15;
        System.out.println("Test case 7 - Maximum value: " + fractionalKnapsack(weight7, value7, capacity7));
    }
}