class Solution:
    def countBits(self, n: int) -> List[int]:
        result = []

        for i in range(0, n + 1):
            count = 0
            while(i > 0):
                if (i % 2 != 0):
                    count = count + 1
                i = i >> 1
                
            result.append(count)

        return result