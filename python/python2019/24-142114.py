inp=input()
digit=0
letters=0
for i in inp:
    if i in '0123456789':
        digit+=1
    elif i in 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ':
        letters+=1
print('LETTERS',letters)
print('DIGITS',digit)