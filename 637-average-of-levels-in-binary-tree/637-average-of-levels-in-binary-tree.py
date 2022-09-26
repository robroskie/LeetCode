# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def averageOfLevels(self, root: Optional[TreeNode]) -> List[float]:
        if not root:
            return 0

        queue = []
        queue.append(root)

        levelAvg = []

        while queue:
            sum = 0
            size = len(queue)

            for i in range(size):
                currentElement = queue.pop(0)
                sum += currentElement.val

                if currentElement.left:
                    queue.append(currentElement.left)
                if currentElement.right:
                    queue.append(currentElement.right)

            levelAvg.append(sum / size)

        return levelAvg