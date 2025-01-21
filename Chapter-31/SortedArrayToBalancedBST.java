public class SortedArrayToBalancedBST{
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
    public static Node buildBalancedBST(int nodes[],int si,int ei){
        if(si>ei)return null;
        int mid=si+(ei-si)/2;
        Node newNode=new Node(nodes[mid]);
        newNode.left=buildBalancedBST(nodes,si,mid-1);
        newNode.right=buildBalancedBST(nodes,mid+1,ei);
        return newNode;
    }
    public static void preOrder(Node root){
        if(root==null)return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        // int nodes[]={3,5,6,8,10,11,12};
        // Node root=buildBalancedBST(nodes,0,nodes.length-1);
        // preOrder(root);
        // Test case 1: General case with a sorted array
        int nodes1[] = {3, 5, 6, 8, 10, 11, 12};
        Node root1 = buildBalancedBST(nodes1, 0, nodes1.length - 1);
        System.out.print("Pre-order traversal of BST 1: ");
        preOrder(root1);
        System.out.println();

        // Test case 2: Empty array
        int nodes2[] = {};
        Node root2 = buildBalancedBST(nodes2, 0, nodes2.length - 1);
        System.out.print("Pre-order traversal of BST 2: ");
        preOrder(root2);  // Should print nothing
        System.out.println();

        // Test case 3: Single element array
        int nodes3[] = {7};
        Node root3 = buildBalancedBST(nodes3, 0, nodes3.length - 1);
        System.out.print("Pre-order traversal of BST 3: ");
        preOrder(root3);
        System.out.println();

        // Test case 4: Even number of elements
        int nodes4[] = {2, 4, 6, 8, 10, 12};
        Node root4 = buildBalancedBST(nodes4, 0, nodes4.length - 1);
        System.out.print("Pre-order traversal of BST 4: ");
        preOrder(root4);
        System.out.println();
    }
}