imp=list(map(int,input().split(',')))
x=[]
for i in range(imp[0],imp[len(imp)-1]):
    if i in imp:
        continue
    else:
        x.append(i)
print(x)
