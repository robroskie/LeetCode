# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def zigzagLevelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        list = []

        if not root:
            return list

        queue = [root]

        even = False

        while queue:
            even = not even
            temp = []
            size = len(queue)

            for i in range(size):
                curr = queue.pop(0)

                if even:
                    temp.append(curr.val)
                else:
                    temp.insert(0, curr.val)

                if curr.left:

                    queue.append(curr.left)
                if curr.right:
                    queue.append(curr.right)

            list.append(temp)

        return list
