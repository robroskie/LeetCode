class Solution:
    def hammingWeight(self, n: int) -> int:
        count = 0

        while(n > 0):
            if(n % 2 != 0):
                count = count + 1
            n =  n >> 1

        return count