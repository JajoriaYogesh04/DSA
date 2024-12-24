import java.util.*;
/*
    Following is the TreeNode class structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    };
*/

import java.util.List;

public class Solution {
    public static void traversal(TreeNode root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        traversal(root.left, list);
        list.add(root.data);
        traversal(root.right, list);
    }
    public static List< Integer > getInOrderTraversal(TreeNode root) {
        // Write your code here.
        ArrayList<Integer> list= new ArrayList<>();
        traversal(root, list);
        return list;
    }
}