a = False
b = []
count=0
while a!=True:
    b.append(input())
    if b[count]=='quit':
        b.pop()
        a==True
        break
    count+=1
for i in range(len(b)):
    print(b.pop())

    