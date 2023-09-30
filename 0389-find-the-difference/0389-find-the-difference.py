class Solution:
    def findTheDifference(self, s: str, t: str) -> str:
        '''for i in t:
            if i not in s:
                if len(s)!=len(t):
                    return i'''
        s_co = Counter(s)
        t_co = Counter(t)

        for char, count in t_co.items():
            if char not in s_co or s_co[char] != count:
                return char
