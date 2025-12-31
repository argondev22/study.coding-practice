class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        if len(s) != len(t):
            return False

        map = {}

        for c in s:
            if c in map:
                map[c] += 1
            else:
                map[c] = 1
        
        for c in t:
            if c not in map:
                return False
            
            map[c] -= 1
        
        for v in map.values():
            if v != 0:
                return False
        
        return True
