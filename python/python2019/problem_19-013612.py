def recur(i):
    if i==0:
        return 1
    elif i==1:
        return 1
    else:
        return recur(i-2)+recur(i-1)

inp = int(input())
print(recur(inp))
