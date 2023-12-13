class Solution:
    def numSpecial(self, mat: List[List[int]]) -> int:
        count =0
        def col_sum(col_index):
            return sum(row[col_index] for row in mat)
        for row in mat:
            if sum(row) == 1:
                col_index = row.index(1)
                count += col_sum(col_index) == 1

        return count
