public class SizeOfLargestBSTinBT{
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
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    static class Info{
        boolean validBST;
        int size;
        int min;
        int max;
        Info(boolean validBST,int size,int min,int max){
            this.validBST=validBST;
            this.size=size;
            this.min=min;
            this.max=max;
        }
    }
    public static int maxSize=0;
    public static Info sizeLargestBST(Node root){
        if(root==null)return new Info(true,0,Integer.MAX_VALUE,Integer.MIN_VALUE);
        Info leftInfo=sizeLargestBST(root.left);
        Info rightInfo=sizeLargestBST(root.right);
        int size=leftInfo.size+rightInfo.size+1;
        int min=Math.min(root.data,Math.min(leftInfo.min,rightInfo.min));
        int max=Math.max(root.data,Math.max(leftInfo.max,rightInfo.max));
        if(root.data<=leftInfo.max||root.data>=rightInfo.min){
            return new Info(false,size,min,max);
        }
        if(leftInfo.validBST&&rightInfo.validBST){
            maxSize=Math.max(size,maxSize);
            return new Info(true,size,min,max);
        }
        return new Info(false,size,min,max);
    }
    public static void main(String args[]){
        // Test Case 1
        Node root1 = new Node(50);
        root1.left = new Node(30);
        root1.left.left = new Node(5);
        root1.left.right = new Node(20);
        root1.right = new Node(60);
        root1.right.left = new Node(45);
        root1.right.right = new Node(70);
        root1.right.right.left = new Node(65);
        root1.right.right.right = new Node(80);
        System.out.print("Pre-order Traversal of Tree 1: ");
        preOrder(root1);
        maxSize = 0;
        sizeLargestBST(root1);
        System.out.println("\nSize of Largest BST in Tree 1: " + maxSize);

        // Test Case 2: All nodes form a BST
        Node root2 = new Node(15);
        root2.left = new Node(10);
        root2.right = new Node(20);
        root2.left.left = new Node(8);
        root2.left.right = new Node(12);
        root2.right.left = new Node(17);
        root2.right.right = new Node(25);
        System.out.print("Pre-order Traversal of Tree 2: ");
        preOrder(root2);
        maxSize = 0;
        sizeLargestBST(root2);
        System.out.println("\nSize of Largest BST in Tree 2: " + maxSize);

        // Test Case 3: Single node
        Node root3 = new Node(10);
        System.out.print("Pre-order Traversal of Tree 3: ");
        preOrder(root3);
        maxSize = 0;
        sizeLargestBST(root3);
        System.out.println("\nSize of Largest BST in Tree 3: " + maxSize);

        // Test Case 4: No BST (all nodes violate the BST property)
        Node root4 = new Node(10);
        root4.left = new Node(20);
        root4.right = new Node(5);
        System.out.print("Pre-order Traversal of Tree 4: ");
        preOrder(root4);
        maxSize = 0;
        sizeLargestBST(root4);
        System.out.println("\nSize of Largest BST in Tree 4: " + maxSize);
    }
}