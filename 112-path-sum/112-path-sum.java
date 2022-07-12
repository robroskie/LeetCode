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
    public static boolean hasPathSum(TreeNode root, int targetSum) {
    	if(root == null)
    		return false;
    	
    	boolean left = root.left != null;
    	boolean right = root.right != null;
    	
    	if(!left && !right && root.val == targetSum) 
    		return true;
    	
    	targetSum -= root.val;

		return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }
}