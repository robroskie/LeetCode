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
	public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();

		List<List<Integer>> return_list = new LinkedList<List<Integer>>();

		if (root == null) {
			return return_list;
		}

		q.add(root);
		
		boolean odd = true;
		
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> temp_list = new LinkedList<>();
			
			for(int i = 0; i < size; i++) {
				TreeNode currentNode = q.poll();
				
				if(odd)
					temp_list.add(currentNode.val);
				else
					temp_list.add(0, currentNode.val);
				
				if (currentNode.left != null)
					q.add(currentNode.left);
				if (currentNode.right != null)
					q.add(currentNode.right);
	
			}
		
			return_list.add(temp_list);
			if(odd)
				odd = false;
			else
				odd =true;
			
		}
		return return_list;
	}

}