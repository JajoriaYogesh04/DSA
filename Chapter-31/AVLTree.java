public class AVLTree{
static class Node{
        int data;
        int height;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.height=1;
            this.left=null;
            this.right=null;
        }
    }
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static int getHeight(Node root){
        if(root==null)return 0;
        return root.height;
    }
    public static int getBalanceFactor(Node root){
        if(root==null)return 0;
        return getHeight(root.left)-getHeight(root.right);
    }
    public static Node rightRotate(Node x){
        Node y=x.left;
        Node t1=y.right;
        y.right=x;
        x.left=t1;
        x.height=Math.max(getHeight(x.left),getHeight(x.right))+1;
        y.height=Math.max(getHeight(y.left),getHeight(y.right))+1;
        return y;
    }
    public static Node leftRotate(Node x){
        Node y=x.right;
        Node t2=y.left;
        y.left=x;
        x.right=t2;
        x.height=Math.max(getHeight(x.left),getHeight(x.right))+1;
        y.height=Math.max(getHeight(y.left),getHeight(y.right))+1;
        return y;
    }
    public static Node insertNode(Node root,int val){
        if(root==null)return new Node(val);
        if(root.data>val){
            root.left=insertNode(root.left,val);
        }
        else if(root.data<val){
            root.right=insertNode(root.right,val);
        }
        else{
            return root;
        }
        root.height=Math.max(getHeight(root.left),getHeight(root.right))+1;
        int bf=getBalanceFactor(root);
        //LL
        if(bf>1&&val<root.left.data){
            return rightRotate(root);
        }
        //RR
        if(bf<-1&&val>root.right.data){
            return leftRotate(root);
        }
        //LR
        if(bf>1&&val>root.left.data){
            root.left=leftRotate(root.left);
            return rightRotate(root);
        }
        //RL
        if(bf<-1&&val<root.right.data){
            root.right=rightRotate(root.right);
            return leftRotate(root);
        }
        return root;
    }
    public static void main(String args[]){
        // Test Case 1: Balanced tree with distinct values
        int[] nodes1 = {40, 20, 10, 25, 30, 22, 50};
        Node root1 = null;
        for (int val : nodes1) {
            root1 = insertNode(root1, val);
        }
        System.out.print("Test Case 1 (Balanced Tree): ");
        preOrder(root1); // Expected: 25 20 10 22 40 30 50
        System.out.println();

        // Test Case 2: Left-heavy tree
        int[] nodes2 = {50, 40, 30, 20, 10};
        Node root2 = null;
        for (int val : nodes2) {
            root2 = insertNode(root2, val);
        }
        System.out.print("Test Case 2 (Left-Heavy Tree): ");
        preOrder(root2); // Expected: 30 20 10 40 50
        System.out.println();

        // Test Case 3: Right-heavy tree
        int[] nodes3 = {10, 20, 30, 40, 50};
        Node root3 = null;
        for (int val : nodes3) {
            root3 = insertNode(root3, val);
        }
        System.out.print("Test Case 3 (Right-Heavy Tree): ");
        preOrder(root3); // Expected: 30 20 10 40 50
        System.out.println();

        // Test Case 4: Mixed insertions causing LL, RR, LR, RL rotations
        int[] nodes4 = {20, 10, 30, 25, 40, 35, 5};
        Node root4 = null;
        for (int val : nodes4) {
            root4 = insertNode(root4, val);
        }
        System.out.print("Test Case 4 (Mixed Rotations): ");
        preOrder(root4); // Expected: 30 20 10 5 25 40 35
        System.out.println();

        // Test Case 5: Single-node tree
        int[] nodes5 = {10};
        Node root5 = null;
        for (int val : nodes5) {
            root5 = insertNode(root5, val);
        }
        System.out.print("Test Case 5 (Single Node): ");
        preOrder(root5); // Expected: 10
        System.out.println();

        // Test Case 6: Duplicate values (should be ignored)
        int[] nodes6 = {10, 20, 30, 20, 10};
        Node root6 = null;
        for (int val : nodes6) {
            root6 = insertNode(root6, val);
        }
        System.out.print("Test Case 6 (Duplicates Ignored): ");
        preOrder(root6); // Expected: 20 10 30
        System.out.println();
    }
}