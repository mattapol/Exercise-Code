u = []
check = 0
l = input()
ll = l.split(',')
if len(ll) < 2:
    print('None')
else:
    for i in range(len(ll)):
        j = int(ll[i])
        u.append(j)
    u.sort()
    check = int(u[1]) - int(u[0])
    
for i in range(len(u) - 1 ):
    if u[i + 1] - u[i] < check:
        check = int(u[i + 1]) - int(u[i])

for i in range(len(u) - 1 ):
    if int(u[i + 1]) - int(u[i]) == check:
        print(str(u[i]) + ',' + str(u[i+1]))
