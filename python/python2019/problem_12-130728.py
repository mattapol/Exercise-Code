x = int(input())
a = ''
b = x
c = 0
for i in range(x):
    for j in range(x):
        if j==c or j==(b-1) :
            a += '*'
        else:
            a += ' '
    b = b - 1
    c = c + 1
    a += '\n'
print(a)