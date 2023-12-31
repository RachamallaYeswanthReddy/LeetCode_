class Solution:
    def minimizeSet(self, d1: int, d2: int, ct1: int, ct2: int) -> int:
        
        f = lambda x: (x+abs(x))//2                             

        n, prev, d = ct1 + ct2, 0, lcm(d1,d2)

        while n > prev:   
            
            prev = n       

            l1, l2  = n//d2 - n//d, n//d1 - n//d

            n+= f(f(ct1 - l1) + f(ct2 - l2)- n + n//d + l2 + l1)
            
        return n

