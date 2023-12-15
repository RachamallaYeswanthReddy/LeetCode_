class Solution:
    def maximumGain(self, s: str, x: int, y: int) -> int:
        if x < y:
            x, y, s = y, x, s[::-1]
        a = b = ans = 0
        for c in s:
            if c == 'a':
                a += 1
            elif c == 'b':
                if a:
                    ans += x
                    a -= 1
                else:
                    b += 1
            else:
                ans += min(a,b)*y
                a = b = 0
        return ans + min(a,b)*y
