class Solution:
    def missingNumber(self, nums: List[int]) -> int:
        sums = 0
        for i in range(len(nums) + 1):
            sums += i
            print(sums)

        return sums - sum(nums)
