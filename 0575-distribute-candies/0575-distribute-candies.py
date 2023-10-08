class Solution:
    def distributeCandies(self, candyType: List[int]) -> int:
        single_candies = set(candyType)
        return min(len(single_candies),len(candyType)//2)