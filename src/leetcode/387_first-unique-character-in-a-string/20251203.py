class Solution:
    # input: leetcode
    # output: 0
    def firstUniqChar(self, s: str) -> int:
        # edge case (if s.length == 1 return 0)
        if len(s) <= 1:
            return 0

        m = {}

        for e in s:
            if e in m:
                m[e] += 1
            else:
                m[e] = 1
        
        for i in range(len(s)):
            e = s[i]
            if m[e] == 1:
                return i
        
        return -1
