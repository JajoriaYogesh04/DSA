/************************************************************

 Following is the TreeNode class structure

 class TreeNode<T>
 {
     T data;
     TreeNode<T> left;
     TreeNode<T> right;

     TreeNode(T data)
     {
         this.data = data;
         left = null;
         right = null;
     }
 };

 ************************************************************/
import java.util.*;
public class Solution {
    public static boolean getPath(TreeNode<Integer> root, int node, ArrayList<Integer> list){
        if(root==null){
            return false;
        }    
        list.add(root.data);
        if(root.data==node){
            return true;
        }
        if(getPath(root.left, node, list)||getPath(root.right, node, list)){
            return true;
        }
        list.remove(list.size()-1);
        return false;
    }
    public static int lowestCommonAncestor(TreeNode<Integer> root, int x, int y) {
        //    Write your code here.
        ArrayList<Integer> path1= new ArrayList<>();
        ArrayList<Integer> path2= new ArrayList<>();
        getPath(root, x, path1);
        getPath(root, y, path2);
        int i=0;
        for(;(i<path1.size() && i<path2.size()); i++){
            if(path1.get(i)!=path2.get(i)){
                break;
            }
        }
        return path1.get(i-1);
    }
}
