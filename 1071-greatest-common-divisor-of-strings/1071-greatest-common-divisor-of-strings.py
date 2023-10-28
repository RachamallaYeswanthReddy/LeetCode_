class Solution:
    def gcdOfStrings(self, str1: str, str2: str) -> str:
        if str1 + str2 != str2 + str1:
            return ""
        
        def gcd(a, b):
            if b == 0:
                return a
            return gcd(b, a % b)
        
        length1 = len(str1)
        length2 = len(str2)
        gcd_len = gcd(length1, length2)
        
        return str1[:gcd_len]