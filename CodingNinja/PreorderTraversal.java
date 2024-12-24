import java.util.* ;
import java.io.*; 

/*******************************************************
Following is the BinaryTreeNode class structure

class BinaryTreeNode<T> {
    T data;
    BinaryTreeNode<T> left;
    BinaryTreeNode<T> right;
    
    public BinaryTreeNode(T data) {
        this.data = data;
    }
}
*******************************************************/
import java.util.ArrayList;

public class Solution {
    public static void traversal(BinaryTreeNode<Integer> root, ArrayList<Integer> list){
        if(root==null){
            return;
        }
        list.add(root.data);
        traversal(root.left, list);
        traversal(root.right, list);
    }
	public static ArrayList<Integer> preorderTraversal(BinaryTreeNode<Integer> root) {
		// Write your code here
        ArrayList<Integer> list= new ArrayList<>();
        traversal(root, list);
        return list;
	}
}