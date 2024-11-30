//Brute force

// import java.util.* ;
// import java.io.*; 
// public class Solution {
//     public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
//     	// Write your code here.
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(matrix.get(i).get(j)==0){
//                     for(int col=0; col<m; col++){
//                         if(matrix.get(i).get(j)!=0){
//                             matrix.get(i).set(col, -1);
//                         } 
//                     }
//                     for(int row=0; row<n; row++){
//                         if(matrix.get(i).get(j)!=0){
//                             matrix.get(j).set(row, -1);
//                         }
//                     }
//                 }
//             }
//         }
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(matrix.get(i).get(j)==-1){
//                     matrix.get(i).set(j, 0);
//                 }
//             }
//         }
//         return matrix;
//     }
// }


//Better

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        int markRow[]= new int[n];
        int markCol[]= new int[m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j)==0){
                    markRow[i]= 1;
                    markCol[j]= 1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(markRow[i]==1 || markCol[j]==1){
                    matrix.get(i).set(j, 0);
                }
            }
        }
        return matrix;
    }
}