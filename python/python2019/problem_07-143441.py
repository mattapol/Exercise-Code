string = input()
word_list = list()
print_word = ''
for i in string:
    if i not in word_list:
        word_list.append(i)
print(', '.join(word_list))
