# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        if head.next == None:
            return
        
        temp = head

        arr = []



        while temp != None:
            arr.append(temp.val)
            temp = temp.next

        left = 0
        right = len(arr) - 1

        newHead = ListNode(arr[left])
        tempnewHead = newHead
        tempnewHead.next = ListNode(arr[right])
        tempnewHead = tempnewHead.next

        left += 1
        right -= 1

        while left < right:
            tempnewHead.next = ListNode(arr[left])
            tempnewHead = tempnewHead.next
            tempnewHead.next = ListNode(arr[right])
            tempnewHead = tempnewHead.next

            left += 1
            right -= 1

        if len(arr) % 2 != 0:
            tempnewHead.next = ListNode(arr[math.floor(len(arr) / 2)])
            tempnewHead = tempnewHead.next

        temp3 = head
        tempnewHead = newHead

        while tempnewHead != None:
            temp3.val = tempnewHead.val
            tempnewHead = tempnewHead.next
            temp3 = temp3.next
