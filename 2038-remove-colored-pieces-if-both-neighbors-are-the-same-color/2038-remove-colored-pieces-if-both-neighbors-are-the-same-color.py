class Solution:
    def winnerOfGame(self, colors: str) -> bool:
        point_alice = 0
        point_bob = 0
        
        for i in range(1,len(colors)-1):
            if colors[i-1]==colors[i]==colors[i+1] :
                if colors[i] =='A':
                    point_alice +=1
                else:
                    point_bob += 1
        return point_alice-point_bob>=1