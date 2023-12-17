#include <bitset>

class Solution {
public:
    int countSetBits(int num) {
        int count = 0;
        while (num) {
            count += num & 1;
            num >>= 1;
        }
        return count;
    }

    bool isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= sqrt(num); ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    int countPrimeSetBits(int left, int right) {
        int count = 0;
        for (int i = left; i <= right; ++i) {
            int setBitsCount = countSetBits(i);
            if (isPrime(setBitsCount)) {
                ++count;
            }
        }
        return count;
    }
};