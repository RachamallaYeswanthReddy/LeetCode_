class Solution:
    def powerfulIntegers(self, x: int, y: int, bound: int) -> List[int]:
        l = []
        if bound<=1:return l
        if x> 1: L = int(log(bound,x))+1
        else: L= 1
        if y> 1: 
            M = int(log(bound,y))+1
        else:M=1
        for i in range(L):
            for j in range(M):
                if x**i+y**j<=bound:
                    l.append(x**i+y**j)
                    
        return set(l)