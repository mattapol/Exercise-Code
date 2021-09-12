t = []
u = []
t = input()
tt = t.split(' ')
for i in range(len(tt)):
    j = int(tt[i])
    u.append(j)
for i in range(u[0]):
    if (i+1) % u[1] == 0:
        print(i+1)