def recur(i):
    if i==0:
        return 0
    elif i==1:
        return 1
    else:
        return recur(i-1)*2

inp = int(input())
print(recur(inp))