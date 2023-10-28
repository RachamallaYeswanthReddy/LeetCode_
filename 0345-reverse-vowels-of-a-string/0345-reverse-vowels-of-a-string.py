class Solution:
    def reverseVowels(self, s: str) -> str:
        vowels = ['a','e','i','o','u','A','E','I','O','U']
        dup = s
        letters = []
        for i in dup:
            if i in vowels:
                letters.append(i)
        letters = letters[::-1]
        result = []
        vowel_idx = 0
        
        for char in s:
            if char in vowels:
                result.append(letters[vowel_idx])
                vowel_idx += 1
            else:
                result.append(char)
        
        return ''.join(result)