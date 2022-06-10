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
    public List<List<Integer>> levelOrder(TreeNode root) {
//      Queue to hold values popped from tree
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        
//      Starting value popped from tree to begin algorithm
        q.offer(root);
       
//      Main list which each of the sublists are to be added to
        List<List<Integer>> mainList = new LinkedList<List<Integer>>();
        
//      Edge case
        if(root == null)
            return mainList;
        
//      Run the algorithm until the queue is empty ==> entire tree has been traversed
        while(!q.isEmpty()){
//          size of current level to be iterated over 
            int len = q.size();
            
//          The sublist is used to hold the values for the current level, which are then added to the return list
            List<Integer> currLvl = new LinkedList<Integer>();
            for(int i = 0; i < len; i++){
//              Remove current value from tree and add to list for current lvl
                TreeNode currVal = q.remove();
                currLvl.add(currVal.val);
//              Add the left and right children of the current value to the q, if they exist
                if(currVal.left != null)
                    q.add(currVal.left);
                if(currVal.right != null)
                    q.add(currVal.right);
   
            }
                mainList.add(currLvl);
        }
        

        return mainList;
    }
}