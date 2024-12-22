public class LexicographicallySmallestStringOfLengthNAndSumK{
    public static String lexicographicallySmallestStringOfLengthNAndSumK(int n, int k){
        char str[]= new char[n];
        for(int i=0; i<n; i++){
            str[i]='a';
            k--;
        }
        for(int i=n-1; i>=0; i--){
            if(k>=25){
                str[i]='z';
                k-=25;
            }
            else{
                str[i]=(char)(97+k);
                k-=k;
            }
        }
        return new String(str);
    }
    public static void main(String args[]){
        // List of test cases
        int[][] testCases = {
            {1, 1}, {2, 50}, {3, 10}, {3, 30}, // Small inputs
            {5, 73}, {6, 100}, {7, 105},       // Moderate inputs
            {10, 10}, {10, 260},               // Edge cases
            {100000, 100000}, {100000, 2600000}, // Large inputs
            {5, 27}, {8, 104}, {10, 95},        // Non-typical cases
            {15, 200}, {20, 400}, {50, 1000}    // Complex distributions
        };

        // Execute and print results
        for (int[] testCase : testCases) {
            int n = testCase[0];
            int k = testCase[1];
            long start = System.currentTimeMillis();
            String result = lexicographicallySmallestStringOfLengthNAndSumK(n, k);
            long end = System.currentTimeMillis();
            System.out.printf("n = %d, k = %d --> Result: %s, Time: %d ms%n", n, k, result.substring(0, Math.min(50, result.length())) + "...", end - start);
        }
    }
}