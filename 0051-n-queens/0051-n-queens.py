class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        # I am going to use the back tracking bruteforce approach 
        col = set()
        diagonal1 = set()
        diagonal2 = set()
        
        res = []
        board = [["."]*n for i in range(n)] # empty places should have .
        
        def backtrack(r):
            if r==n:
                copy = ["".join(row) for row in board]
                res.append(copy)
                return
            for c in range(n):
                if c in col or (r+c) in diagonal1 or (r-c) in diagonal2:
                    continue
                col.add(c)
                diagonal1.add(r+c)
                diagonal2.add(r-c)
                board[r][c] = "Q"
                backtrack(r+1)
                col.remove(c)
                diagonal1.remove(r+c)
                diagonal2.remove(r-c)
                board[r][c]="."
        backtrack(0)
        return res