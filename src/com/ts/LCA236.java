package com.ts;

 /* practiced By:  Ankul Deshpande 
    //Input: root = [3,5,1,6,2,0,8,null,null,7,4], p = 5, q = 1
    //Output: 3
    //Explanation: The LCA of nodes 5 and 1 is 3.
  */

class TreeNode {
    int value;
    TreeNode right;
    TreeNode left;

    TreeNode(int value) {
        this.value = value;
    }
}


public class LCA236 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //base case
        if (root == null || root==p || root==q) {
            return root;
        }
        //recursive call:
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        //if both side return non-null then root is LCA
        if (left != null && right != null) {
            return root;
        }

        //otherwise return whatever side is non-null:
        return left != null ? left : right;
    }


    public static void main(String[] args) {

        //create the tree
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(5);
        root.right = new TreeNode(1);
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);
        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode p = root.left;
        TreeNode q = root.left.right.right ;
        LCA236 lca236 = new LCA236();
        TreeNode lca = lca236.lowestCommonAncestor(root, p, q);
        System.out.println("LCA of " + p.value + " and " + q.value + " is: " + lca.value);

    }

}
