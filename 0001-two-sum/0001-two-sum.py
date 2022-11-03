class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict = {}

        for i in range(0, len(nums)):
            dict[nums[i]] = i;

        # print(dict)

        left = 0
        right = len(nums) - 1

        for i in range(0, len(nums)):
            curr = target - nums[i]
            if curr in dict and i != dict[curr]:
                return [i, dict[curr]]