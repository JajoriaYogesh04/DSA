import java.util.*;
public class ChocolaProblem{
    public static int chocolaProblem(int n, int m, Integer vercost[], Integer horcost[]){
        Arrays.sort(vercost, Comparator.reverseOrder());
        Arrays.sort(horcost, Comparator.reverseOrder());
        int hor= 0;
        int ver= 0;
        int horpart= 1;
        int verpart= 1;
        int cost= 0;
        while(hor<horcost.length && ver<vercost.length){
            if(horcost[hor]>=vercost[ver]){
                cost+=verpart*horcost[hor];
                hor++;
                horpart++;
            }
            else{
                cost+=horpart*vercost[ver];
                ver++;
                verpart++;
            }
        }
        while(hor<horcost.length){
            cost+=verpart*horcost[hor];
            hor++;
            horpart++;
        }
        while(ver<vercost.length){
            cost+=horpart*vercost[ver];
            ver++;
            verpart++;
        }
        return cost;
    }
    public static void main(String args[]){
        // Test Case 1: Standard input
        Integer[] vercost1 = {2, 1, 3, 1, 4};
        Integer[] horcost1 = {4, 1, 2};
        System.out.println("Test Case 1 Result: " + chocolaProblem(4, 6, vercost1, horcost1) + " (Expected: 42)");

        // Test Case 2: Minimum input (1 row, 1 column, no cuts required)
        Integer[] vercost2 = {};
        Integer[] horcost2 = {};
        System.out.println("Test Case 2 Result: " + chocolaProblem(1, 1, vercost2, horcost2) + " (Expected: 0)");

        // Test Case 3: More horizontal cuts than vertical cuts
        Integer[] vercost3 = {1, 2};
        Integer[] horcost3 = {1, 3, 2};
        System.out.println("Test Case 3 Result: " + chocolaProblem(4, 3, vercost3, horcost3) + " (Expected: 17)");

        // Test Case 4: All cuts have the same cost
        Integer[] vercost4 = {2, 2, 2};
        Integer[] horcost4 = {2, 2};
        System.out.println("Test Case 4 Result: " + chocolaProblem(3, 4, vercost4, horcost4) + " (Expected: 22)");

        // Test Case 5: Large input
        Integer[] vercost5 = {10, 20, 30, 40, 50, 60};
        Integer[] horcost5 = {15, 25, 35, 45};
        System.out.println("Test Case 5 Result: " + chocolaProblem(5, 7, vercost5, horcost5) + " (Expected: 900)");

        // Test Case 6: Single row or column
        Integer[] vercost6 = {5, 10, 15};
        Integer[] horcost6 = {};
        System.out.println("Test Case 6 Result: " + chocolaProblem(1, 4, vercost6, horcost6) + " (Expected: 30)");
    }
}