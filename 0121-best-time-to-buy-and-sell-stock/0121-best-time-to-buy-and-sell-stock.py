class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        if not prices:
            return 0
        #buy = min(prices)
        min_price = prices[0]
        maxi = 0
        #for i in range(prices.index(buy)+1,len(prices)):
        for price in prices:
            min_price = min(price,min_price)
            maxi = max(price-min_price ,maxi )
        return maxi