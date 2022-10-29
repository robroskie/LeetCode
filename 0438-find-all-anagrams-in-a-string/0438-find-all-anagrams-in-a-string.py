class Solution:
    def findAnagrams(self, s: str, p: str) -> List[int]:
        indices = []
        left = 0
        map = {}
        ana = {}

        for i in p:
            if i not in ana:
                ana[i] = 1
            else:
                ana[i] = ana[i] + 1

        # Add first n values => length of (p)
        for i in range(0, len(s)):
            if s[i] not in map:
                map[s[i]] = 1
            else:
                map[s[i]] = map[s[i]] + 1

            # Shift left when gap between two sets values gets too large
            if (i - left) >= len(p):
                if map[s[left]] == 1:
                    map.pop(s[left])
                else:
                    map[s[left]] = map[s[left]] - 1
                left += 1
            if map == ana:
                indices.append(left)

        return indices