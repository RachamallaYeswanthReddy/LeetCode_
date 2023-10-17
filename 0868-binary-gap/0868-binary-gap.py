class Solution:
    def binaryGap(self, n: int) -> int:
        bin_value = bin(n)[2:]
        length = len(bin_value)
        maxi = 0
        for i in range(length):
            if bin_value[i]=='1':
                for j in range(i+1,length):
                    if bin_value[j]=='1':
                        distance = j-i
                        if distance>maxi:
                            maxi = distance
                        break
        return maxi