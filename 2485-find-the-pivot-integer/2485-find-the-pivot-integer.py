class Solution:
    def pivotInteger(self, n: int) -> int:
        if n == 1:return 1
        for i in range(n):
            if sum(range(1,i+1)) == sum(range(i,n+1)): 
                # +1 is added bcozz.. it ranges from 1,i+1 it doesnt include i+1 
                return i
        return -1 