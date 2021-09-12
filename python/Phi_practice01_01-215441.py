l = input()
ll = l.split(",")
lll = len(ll)
minA = 1000
maxA = 0
for i in range(1,lll,2):
    if minA > int(ll[i]):
        minA = int(ll[i])
        u = ll[i-1]
for i in range(1,lll,2):
    if maxA < int(ll[i]):
        maxA = int(ll[i])
        uu = ll[i-1]
    else:
        manA = ll[i-1]
print(uu+","+u)