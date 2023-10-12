class Solution:
    def findTheDistanceValue(self, arr1: List[int], arr2: List[int], d: int) -> int:
        distance = 0
        for num1 in arr1:
            boolean = True
            for num2 in arr2:
                if abs(num1 - num2) <= d:
                    boolean = False
                    break
            if boolean:
                distance += 1
        return distance