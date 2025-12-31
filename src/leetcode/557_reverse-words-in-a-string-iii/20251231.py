class Solution:
    def reverseWords(self, s: str) -> str:
        words = s.split()
        words = [reverseString(word) for word in words]
        return " ".join(words)
      
def reverseString(s: str) -> str:
    s = list(s)
    right = 0
    left = len(s) - 1

    while right < left:
        tmp = s[left]
        s[left] = s[right]
        s[right] = tmp

        right += 1
        left -= 1
    
    return "".join(s)
