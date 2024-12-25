import java.util.* ;
import java.io.*; 
/*

	Following is the structure used to represent the Binary Tree Node

	class BinaryTreeNode<T> {
		T val;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T val) {
			this.val = val;
			this.left = null;
			this.right = null;
		}
	}

*/

import java.util.*;

public class Solution {

  public static ArrayList<Integer> getLevelOrder(BinaryTreeNode root) {
    //Your code goes here
	ArrayList<Integer> list= new ArrayList<>();
	if(root==null){
		return list;
	}
	Queue<BinaryTreeNode> q= new LinkedList<>();
	q.add(root);
	while(!q.isEmpty()){
		BinaryTreeNode top= q.remove();
		list.add(top.val);
		if(top.left!=null){
			q.add(top.left);
		}
		if(top.right!=null){
			q.add(top.right);
		}
	}
	return list;
  }

}