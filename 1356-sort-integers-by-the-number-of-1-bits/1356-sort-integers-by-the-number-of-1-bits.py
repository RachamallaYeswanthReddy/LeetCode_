class Solution:
    def sortByBits(self, arr: List[int]) -> List[int]:
        '''bin_num = []
        values = []
        
        for i in arr:
            bin_num.append(bin(i)[2:])
        
        for i in bin_num:
            i = str(i)
            count = 0
            for j in i:
                if j == "1":
                    count += 1
            values.append(count)
        
        return [x for _, x in sorted(zip(values, arr))]'''
        def count_set_bits(num):
            count = 0
            while num:
                num &= (num - 1)
                count += 1
            return count

        def custom_compare(x):
            return (count_set_bits(x), x)

        return sorted(arr, key=custom_compare)
