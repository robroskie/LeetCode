class Solution:
    def reverseBits(self, n: int) -> int:
        result = 0

        for i in range(32):
            # Get the ith bit of n
            bit = ((n >> i) & 1)

            # Place the 8th bit in the reversed location
            result = result | bit << (31 - i)
        return result