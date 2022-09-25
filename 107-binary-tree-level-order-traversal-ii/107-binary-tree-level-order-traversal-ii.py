# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def levelOrderBottom(self, root: Optional[TreeNode]) -> List[List[int]]:
            if(root == None):
                return []
            
            queue = []
            queue.append(root)

            list = []

            while(len(queue) != 0):
                size = len(queue)

                temp = []
                for i in range(size):
                    current = queue.pop(0)
                    temp.append(current.val)

                    # print(current.val, end = ' ')

                    if(current.left != None):
                        queue.append(current.left)
                    if(current.right != None):
                        queue.append(current.right)

                list.insert(0, temp)

                print('\n')

            return list