class Solution:
    def minOperations(self, s: str) -> int:
        count_starting_with_0 = sum(1 for i, char in enumerate(s) if i % 2 == int(char))

        count_starting_with_1 = sum(1 for i, char in enumerate(s) if i % 2 != int(char))

        return min(count_starting_with_0, count_starting_with_1)
