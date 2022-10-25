class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        left = 0
        map = {}
        maxVal = 0

        for i in range(0, len(s)):

            if(s[i] not in map or map[s[i]] == 0):
                map[s[i]] = 1
            else:
                map[s[i]] = map[s[i]] + 1

            while(map[s[i]] > 1):
                map[s[left]] = map[s[left]] - 1
                left += 1

            maxVal = max(maxVal, i - left + 1)

        return maxVal