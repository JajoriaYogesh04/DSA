import java.util.*;
public class TrappingRainWater {
    public static int trappingRainWater(int bar[]){
        Stack<Integer> s= new Stack<>();
        int vol= 0;
        for(int i=0; i<bar.length; i++){
            while(!s.isEmpty() && bar[i]>bar[s.peek()]){
                int popHeight= bar[s.pop()];
                if(s.isEmpty()){
                    break;
                }
                int dist= i-s.peek()-1;
                int level= Math.min(bar[i], bar[s.peek()])-popHeight;
                vol+=dist*level;
            }
            s.push(i);
        }
        return vol;
    }
    public static void main(String args[]){
        // Test case 1: Example from the problem
        int bar1[] = {1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Test Case 1: Water trapped = " + trappingRainWater(bar1)); // Expected: 6

        // Test case 2: Flat surface, no water trapped
        int bar2[] = {3, 3, 3};
        System.out.println("Test Case 2: Water trapped = " + trappingRainWater(bar2)); // Expected: 0

        // Test case 3: Single bar, no water trapped
        int bar3[] = {4};
        System.out.println("Test Case 3: Water trapped = " + trappingRainWater(bar3)); // Expected: 0

        // Test case 4: Valley between bars
        int bar4[] = {4, 1, 3};
        System.out.println("Test Case 4: Water trapped = " + trappingRainWater(bar4)); // Expected: 2

        // Test case 5: All zeros, no bars
        int bar5[] = {0, 0, 0};
        System.out.println("Test Case 5: Water trapped = " + trappingRainWater(bar5)); // Expected: 0

        // Test case 6: Complex terrain
        int bar6[] = {0, 7, 1, 4, 6, 2, 5, 0, 6, 4, 0, 5};
        System.out.println("Test Case 6: Water trapped = " + trappingRainWater(bar6)); // Expected: 24

        // Test case 7: Only rising bars, no valley
        int bar7[] = {1, 2, 3, 4, 5};
        System.out.println("Test Case 7: Water trapped = " + trappingRainWater(bar7)); // Expected: 0

        // Test case 8: Only decreasing bars, no valley
        int bar8[] = {5, 4, 3, 2, 1};
        System.out.println("Test Case 8: Water trapped = " + trappingRainWater(bar8)); // Expected: 0
    }
}