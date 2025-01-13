public class BinarySearchTree{
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
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(val<root.data){
            root.left=insert(root.left,val);
        }
        else{
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void inOrder(Node root){
        if(root==null)return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String args[]){
        // Test case 1: Basic set of nodes
        int nodes1[] = {5, 1, 3, 4, 2, 7};
        Node root1 = null;
        for (int val : nodes1) {
            root1 = insert(root1, val);
        }
        System.out.print("InOrder traversal of Test Case 1: ");
        inOrder(root1);
        System.out.println();

        // Test case 2: Sorted input
        int nodes2[] = {1, 2, 3, 4, 5, 6, 7};
        Node root2 = null;
        for (int val : nodes2) {
            root2 = insert(root2, val);
        }
        System.out.print("InOrder traversal of Test Case 2: ");
        inOrder(root2);
        System.out.println();

        // Test case 3: Reverse sorted input
        int nodes3[] = {7, 6, 5, 4, 3, 2, 1};
        Node root3 = null;
        for (int val : nodes3) {
            root3 = insert(root3, val);
        }
        System.out.print("InOrder traversal of Test Case 3: ");
        inOrder(root3);
        System.out.println();

        // Test case 4: Duplicate elements
        int nodes4[] = {5, 3, 7, 3, 4, 7, 1};
        Node root4 = null;
        for (int val : nodes4) {
            root4 = insert(root4, val);
        }
        System.out.print("InOrder traversal of Test Case 4: ");
        inOrder(root4);
        System.out.println();
        
        // Test case 5: Single node
        int nodes5[] = {10};
        Node root5 = null;
        for (int val : nodes5) {
            root5 = insert(root5, val);
        }
        System.out.print("InOrder traversal of Test Case 5: ");
        inOrder(root5);
        System.out.println();
        
        // Test case 6: Large set of nodes
        int nodes6[] = {15, 10, 20, 8, 12, 16, 25, 6, 9, 11, 14, 18, 23, 30};
        Node root6 = null;
        for (int val : nodes6) {
            root6 = insert(root6, val);
        }
        System.out.print("InOrder traversal of Test Case 6: ");
        inOrder(root6);
        System.out.println();
    }
}