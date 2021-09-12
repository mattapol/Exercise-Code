inp=list(map(int,input().split(',')))
ans=[]
x=[]
for i in range(inp[0]):
    x=[]
    for j in range(inp[1]):
        x.append(i*j)
    ans.append(x)
print(ans)