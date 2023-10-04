class Solution:
    def addToArrayForm(self, num: List[int], k: int) -> List[int]:
        sys.set_int_max_str_digits(10000000)
        a = ""
        for i in range(len(num)):
            a+=str(num[i])
        sum = str(int(a)+k)
        s = []
        for i in sum:
            s.append(int(i))
        return s