

// FUNCTION CODE
/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    Node lowestCommonAncestor(Node root, int a, int b){
        if(root==null||root.data==a||root.data==b){
            return root;
        }
        Node leftlca=lowestCommonAncestor(root.left,a,b);
        Node rightlca=lowestCommonAncestor(root.right,a,b);
        if(leftlca==null){
            return rightlca;
        }
        if(rightlca==null){
            return leftlca;
        }
        return root;
    }
    int distanceBetweenNodes(Node root, int n){
        if(root==null){
            return -1;
        }
        if(root.data==n){
            return 0;
        }
        int ld=distanceBetweenNodes(root.left,n);
        int rd=distanceBetweenNodes(root.right,n);
        if(ld==-1&&rd==-1) return -1;
        return (ld==-1?rd:ld)+1;
    }
    int findDist(Node root, int a, int b) {
        // Your code here
        Node lca=lowestCommonAncestor(root,a,b);
        if(distanceBetweenNodes(root,a)==-1||distanceBetweenNodes(root,b)==-1) return -1;
        int d1=distanceBetweenNodes(lca,a);
        int d2=distanceBetweenNodes(lca,b);
        return d1+d2;
    }
}