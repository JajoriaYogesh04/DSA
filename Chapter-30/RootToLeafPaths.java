import java.util.*;
public class RootToLeafPaths{
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public static Node buildBST(Node root,int val){
        if(root==null)return new Node(val);
        if(val<root.data){
            root.left=buildBST(root.left,val);
        }
        else if(root.data<val){
            root.right=buildBST(root.right,val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void rootToLeafPaths(Node root,ArrayList<Integer>list){
        if(root==null)return;
        list.add(root.data);
        if(root.left==null&&root.right==null){
            System.out.println(list);
        }      
        rootToLeafPaths(root.left,list);
        rootToLeafPaths(root.right,list);
        list.remove(list.size()-1);
    }
    public static void main(String args[]){
        // Test Case 1: Standard BST
        System.out.println("Test Case 1: Standard BST");
        int nodes1[] = {8, 5, 3, 6, 10, 11, 14};
        Node root1 = null;
        for(int i = 0; i < nodes1.length; i++){
            root1 = buildBST(root1, nodes1[i]);
        }
        ArrayList<Integer> list1 = new ArrayList<>();
        rootToLeafPaths(root1, list1);

        // Test Case 2: BST with only one node
        System.out.println("\nTest Case 2: BST with only one node");
        Node root2 = new Node(5);
        ArrayList<Integer> list2 = new ArrayList<>();
        rootToLeafPaths(root2, list2);

        // Test Case 3: Left-skewed tree (only left children)
        System.out.println("\nTest Case 3: Left-skewed tree");
        int nodes3[] = {10, 5, 3, 1};
        Node root3 = null;
        for(int i = 0; i < nodes3.length; i++){
            root3 = buildBST(root3, nodes3[i]);
        }
        ArrayList<Integer> list3 = new ArrayList<>();
        rootToLeafPaths(root3, list3);

        // Test Case 4: Right-skewed tree (only right children)
        System.out.println("\nTest Case 4: Right-skewed tree");
        int nodes4[] = {1, 2, 3, 4};
        Node root4 = null;
        for(int i = 0; i < nodes4.length; i++){
            root4 = buildBST(root4, nodes4[i]);
        }
        ArrayList<Integer> list4 = new ArrayList<>();
        rootToLeafPaths(root4, list4);

        // Test Case 5: Empty tree
        System.out.println("\nTest Case 5: Empty tree");
        Node root5 = null;
        ArrayList<Integer> list5 = new ArrayList<>();
        rootToLeafPaths(root5, list5);
    }
}