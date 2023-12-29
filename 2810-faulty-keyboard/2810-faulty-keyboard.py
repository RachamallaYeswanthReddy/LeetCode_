class Solution:
    def finalString(self, s: str) -> str:
        newstring=""
        for i in s:
            if i=="i":
                newstring=newstring[::-1]
            else:
                newstring+=i
        return newstring
