n = int(input())
for i in range(0,n):
    l = [' ']*n
    l[i] = '*'
    l[n-1-i] = '*'
    s = ''.join(l)
    print(s)