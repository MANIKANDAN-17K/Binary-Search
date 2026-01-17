/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    int sum = 0;
    public int findTilt(TreeNode root) {
        traversel(root);
        return sum;
    }
    private int traversel(TreeNode root){
        if(root == null) return 0;
        int l = 0;
        l = traversel(root.left);
        int r = 0;
        r = traversel(root.right);
        sum += Math.abs(l-r);
        return l+r+root.val;
    }
}
