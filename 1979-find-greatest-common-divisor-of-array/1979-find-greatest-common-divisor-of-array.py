class Solution:
    def findGCD(self, nums: List[int]) -> int:
        '''maxim = max(nums)
        minim = min(nums)
        if(maxim%minim == 0):
            return minim
        elif maxim == minim:
            return minim
        else : return 1'''
        def gcd(a, b):
            while b:
                a, b = b, a % b
            return a

        if not nums:
            return 0  # Handle the case of an empty list.

        maxim = max(nums)
        minim = min(nums)
        result = gcd(maxim,minim)

        return result