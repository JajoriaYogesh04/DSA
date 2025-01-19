import java.util.*;
public class ValidateBST {
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
    public static void getInorder(Node root,ArrayList<Integer>list){
        if(root==null)return;
        getInorder(root.left,list);
        list.add(root.data);
        getInorder(root.right,list);
    }
    public static boolean validateBST(Node root){
        ArrayList<Integer>list=new ArrayList<>();
        getInorder(root,list);
        for(int i=0;i<list.size()-1;i++){
            if(list.get(i)>list.get(i+1))return false;
        }
        return true;
    }
    public static void main(String args[]){ 
        // Test Case 1: Valid BST
        Node root1 = new Node(3);
        root1.left = new Node(2);
        root1.left.left = new Node(1);
        root1.right = new Node(4);
        System.out.println("Test Case 1: " + (validateBST(root1) ? "VALID" : "NON-VALID"));

        // Test Case 2: Not a BST (Left node has a greater value than the root)
        Node root2 = new Node(3);
        root2.left = new Node(4); // Incorrect placement
        root2.right = new Node(5);
        System.out.println("Test Case 2: " + (validateBST(root2) ? "VALID" : "NON-VALID"));

        // Test Case 3: Single Node
        Node root3 = new Node(1);
        System.out.println("Test Case 3: " + (validateBST(root3) ? "VALID" : "NON-VALID"));

        // Test Case 4: More complex valid BST
        Node root4 = new Node(8);
        root4.left = new Node(3);
        root4.right = new Node(10);
        root4.left.left = new Node(1);
        root4.left.right = new Node(6);
        root4.right.right = new Node(14);
        root4.right.right.left = new Node(13);
        System.out.println("Test Case 4: " + (validateBST(root4) ? "VALID" : "NON-VALID"));

        // Test Case 5: More complex invalid BST
        Node root5 = new Node(8);
        root5.left = new Node(3);
        root5.right = new Node(10);
        root5.left.left = new Node(1);
        root5.left.right = new Node(9); // Incorrect placement
        root5.right.right = new Node(14);
        root5.right.right.left = new Node(13);
        System.out.println("Test Case 5: " + (validateBST(root5) ? "VALID" : "NON-VALID"));
    }
}