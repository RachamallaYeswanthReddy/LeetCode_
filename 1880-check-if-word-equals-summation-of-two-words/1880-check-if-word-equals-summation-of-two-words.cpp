class Solution {
public:
    int getNumericValue(string word) {
        int value = 0;
        for (char c : word) {
            value = value * 10 + (c - 'a');
        }
        return value;
    }

    bool isSumEqual(string firstWord, string secondWord, string targetWord) {
        int sum1 = getNumericValue(firstWord);
        int sum2 = getNumericValue(secondWord);
        int sum = getNumericValue(targetWord);

        return (sum1 + sum2 == sum);
    }
};
