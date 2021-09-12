word = list(input())
word_re = word.copy()
word.reverse()


isPalindrome = "YES"

for i in range(len(word)):
    if word[i] != word_re[i]:
        isPalindrome = "NO"
        break
print(isPalindrome)