import java.io.*;

import java.util.* ;
 
/*************************************************************

    Following is the Binary Tree node structure

    class BinaryTreeNode<T> {
	   T data;
	   BinaryTreeNode<T> left;
	   BinaryTreeNode<T> right;
	   
	   public BinaryTreeNode(T data) {
		   this.data = data;
	   }
    }

*************************************************************/

import java.util.*;


public class Solution {
    static int ancestor=-1;  
    static int helper(BinaryTreeNode<Integer>root,int targetNodeVal,int kth){
        if(root==null){
            return -1;
        }
        if(root.data==targetNodeVal){
            return 0;
        }
        int ld=helper(root.left,targetNodeVal,kth);
        int rd=helper(root.right,targetNodeVal,kth);
        if(ld==-1 && rd==-1){
            return -1;
        }
        int dist=Math.max(ld,rd);
        if(dist+1==kth){
            ancestor=root.data;
        }
        return dist+1;
    }    
    static int findKthAncestor(BinaryTreeNode<Integer> root, int targetNodeVal, int kth) {
        // Write your code here.
        ancestor=-1;
        helper(root,targetNodeVal,kth);
        return ancestor;
    }
}   
