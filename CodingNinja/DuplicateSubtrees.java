import java.util.* ;
import java.io.*; 
/************************************************************

    Following is the TreeNode class structure

    class TreeNode<T> 
    {
       public:
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

public class Solution 
{
    public static String duplicate(TreeNode<Integer>root,ArrayList<Integer>list,HashMap<String,Integer>map){
        if(root==null)return "#";
        String str=Integer.toString(root.data)+","+duplicate(root.left,list,map)+","+duplicate(root.right,list,map);
        if(map.get(str)!=null&&map.get(str)==1){
            list.add(root.data);
        }
        if(map.containsKey(str)){
            map.put(str,map.get(str)+1);
        }
        else{
            map.put(str,1);
        } 
        return str;
    }
    public static ArrayList<Integer> duplicateSubtrees(TreeNode<Integer> root) 
    {
        //    Write your code here.
        ArrayList<Integer>list=new ArrayList<>();
        HashMap<String,Integer>map=new HashMap<>();
        duplicate(root,list,map);
        if(list.isEmpty())list.add(-1);
        return list;
    }
}