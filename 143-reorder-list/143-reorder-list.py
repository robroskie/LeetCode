# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        listAsArr = []
        returnlist = []
        temp = head

        while temp != None:
            listAsArr.append(temp.val)
            temp = temp.next

        left = 0
        right = len(listAsArr) - 1

        while left < right:
            returnlist.append(listAsArr[left])
            returnlist.append(listAsArr[right])
            left += 1
            right -= 1

        if (len(listAsArr) % 2) != 0:
            returnlist.append(listAsArr[left])

        head.val = returnlist[0]
        temp = head
        returnlist.pop(0)


        for i in returnlist:
            # print('adding {}'.format(i))
            temp.next.val = i
            temp = temp.next
