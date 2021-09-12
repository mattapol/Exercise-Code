a = list(map(int,input().split(' ')))
a.sort()
if len(a) >= 6:
    print('Too much input!')
else:
    print(a.pop())