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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();

		List<List<Integer>> return_list = new LinkedList<List<Integer>>();

		if (root == null) {
			return return_list;
		}

		q.add(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> temp_list = new LinkedList<Integer>();
			
			for(int i = 0; i < size; i++) {
				TreeNode currentNode = q.poll();
				temp_list.add(currentNode.val);
				
				if(currentNode.left != null)
					q.offer(currentNode.left);
				if(currentNode.right != null)
					q.offer(currentNode.right);
			}
			return_list.add(0, temp_list);
		}
		return return_list;	
	}
}