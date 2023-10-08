class Solution:
    def findMaximumXOR(self, nums: List[int]) -> int:
        max_xor = 0
        mask = 0
        
        for i in range(31, -1, -1):
            mask |= (1 << i)
            
            prefixes = set()
            max_xor_possible = max_xor | (1 << i)
            
            for num in nums:
                prefixes.add(num & mask)
                
            for prefix in prefixes:
                if max_xor_possible ^ prefix in prefixes:
                    max_xor = max_xor_possible
                    break
        
        return max_xor
