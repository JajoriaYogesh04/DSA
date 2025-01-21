import java.util.ArrayList;
public class ConvertBSTtoBalancedBST{
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
    public static Node createBST(ArrayList<Integer>list,int si,int ei){
        if(si>ei)return null;
        int mid= si+(ei-si)/2;
        Node newNode=new Node(list.get(mid));
        newNode.left=createBST(list,si,mid-1);
        newNode.right=createBST(list,mid+1,ei);
        return newNode;
    }
    public static Node balanceBST(Node root){
        ArrayList<Integer>list=new ArrayList<>();
        getInorder(root,list);
        root=createBST(list, 0, list.size()-1);
        return root;
    }
    public static void preOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String args[]){
        // Original Test Case
        System.out.println("Original Tree:");
        Node root = new Node(8);
        root.left = new Node(6);
        root.left.left = new Node(5);
        root.left.left.left = new Node(3);
        root.right = new Node(10);
        root.right.right = new Node(11);
        root.right.right.right = new Node(12);
        preOrder(root);
        System.out.println("\nBalanced Tree:");
        Node balancedRoot = balanceBST(root);
        preOrder(balancedRoot);

        // Additional Test Case 1: Left-skewed Tree
        System.out.println("\n\nLeft-skewed Tree:");
        Node root2 = new Node(10);
        root2.left = new Node(8);
        root2.left.left = new Node(7);
        root2.left.left.left = new Node(5);
        root2.left.left.left.left = new Node(3);
        preOrder(root2);
        System.out.println("\nBalanced Tree:");
        Node balancedRoot2 = balanceBST(root2);
        preOrder(balancedRoot2);

        // Additional Test Case 2: Right-skewed Tree
        System.out.println("\n\nRight-skewed Tree:");
        Node root3 = new Node(3);
        root3.right = new Node(5);
        root3.right.right = new Node(7);
        root3.right.right.right = new Node(8);
        root3.right.right.right.right = new Node(10);
        preOrder(root3);
        System.out.println("\nBalanced Tree:");
        Node balancedRoot3 = balanceBST(root3);
        preOrder(balancedRoot3);

        // Additional Test Case 3: Balanced Tree
        System.out.println("\n\nBalanced Tree:");
        Node root4 = new Node(4);
        root4.left = new Node(2);
        root4.right = new Node(6);
        root4.left.left = new Node(1);
        root4.left.right = new Node(3);
        root4.right.left = new Node(5);
        root4.right.right = new Node(7);
        preOrder(root4);
        System.out.println("\nBalanced Tree (after balancing again):");
        Node balancedRoot4 = balanceBST(root4);
        preOrder(balancedRoot4);

        // Additional Test Case 4: Single Node Tree
        System.out.println("\n\nSingle Node Tree:");
        Node root5 = new Node(1);
        preOrder(root5);
        System.out.println("\nBalanced Tree:");
        Node balancedRoot5 = balanceBST(root5);
        preOrder(balancedRoot5);
    }
}