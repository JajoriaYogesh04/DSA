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

// import java.util.* ;
// import java.io.*; 
// public class Solution {
//     public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
//     	// Write your code here.
//         int markRow[]= new int[n];
//         int markCol[]= new int[m];
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(matrix.get(i).get(j)==0){
//                     markRow[i]= 1;
//                     markCol[j]= 1;
//                 }
//             }
//         }
//         for(int i=0; i<n; i++){
//             for(int j=0; j<m; j++){
//                 if(markRow[i]==1 || markCol[j]==1){
//                     matrix.get(i).set(j, 0);
//                 }
//             }
//         }
//         return matrix;
//     }
// }


//Optimal

import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        int col0= 1;
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(i).set(0, 0);
                    if(j!=0){
                        matrix.get(0).set(j, 0);
                    }
                    else{
                        col0= 0;
                    } 
                }
            }
        }
        for(int i=1; i<n; i++){
            for(int j=1; j<m; j++){
                if(matrix.get(i).get(j)!=0){
                    if(matrix.get(i).get(0)==0 || matrix.get(0).get(j)==0){
                        matrix.get(i).set(j, 0);
                    }   
                }
            }
        }
        if(matrix.get(0).get(0)==0){
            for(int i=0; i<m; i++){
                matrix.get(0).set(i, 0);
            }
        }
        if(col0==0){
            for(int i=0; i<n; i++){
                matrix.get(i).set(0, 0);
            }
        }
        return matrix;
    }
}