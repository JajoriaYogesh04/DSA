public class MirrorBST{
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
            root.left=buildBST(root.left, val);
        }
        else if(val>root.data){
            root.right=buildBST(root.right,val);
        }
        return root;
    }
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static Node mirrorBST(Node root){
        if(root==null)return null;
        Node left=mirrorBST(root.left);
        Node right=mirrorBST(root.right);
        root.left=right;
        root.right=left;
        return root;
    }
    public static void main(String args[]){
        // Test Case 1: Standard case with multiple nodes
        int nodes1[] = {8, 5, 3, 6, 10, 11};
        Node root1 = null;
        for (int i = 0; i < nodes1.length; i++) {
            root1 = buildBST(root1, nodes1[i]);
        }
        System.out.print("Original Tree Pre-Order: ");
        preOrder(root1);
        System.out.println();
        System.out.print("Mirrored Tree Pre-Order: ");
        preOrder(mirrorBST(root1));
        System.out.println("\n");

        // Test Case 2: Single node
        int nodes2[] = {5};
        Node root2 = null;
        for (int i = 0; i < nodes2.length; i++) {
            root2 = buildBST(root2, nodes2[i]);
        }
        System.out.print("Original Single Node Tree Pre-Order: ");
        preOrder(root2);
        System.out.println();
        System.out.print("Mirrored Single Node Tree Pre-Order: ");
        preOrder(mirrorBST(root2));
        System.out.println("\n");

        // Test Case 3: Already mirrored tree (left-skewed tree)
        int nodes3[] = {5, 3, 2, 1};
        Node root3 = null;
        for (int i = 0; i < nodes3.length; i++) {
            root3 = buildBST(root3, nodes3[i]);
        }
        System.out.print("Original Left-Skewed Tree Pre-Order: ");
        preOrder(root3);
        System.out.println();
        System.out.print("Mirrored Left-Skewed Tree Pre-Order: ");
        preOrder(mirrorBST(root3));
        System.out.println("\n");

        // Test Case 4: Empty tree
        Node root4 = null;
        System.out.print("Original Empty Tree Pre-Order: ");
        preOrder(root4);
        System.out.println();
        System.out.print("Mirrored Empty Tree Pre-Order: ");
        preOrder(mirrorBST(root4));
        System.out.println("\n");
    }
}