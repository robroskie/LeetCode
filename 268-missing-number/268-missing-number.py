class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sums = 0
        for i in range(len(nums) + 1):
            sums += i

        return sums - sum(nums)
