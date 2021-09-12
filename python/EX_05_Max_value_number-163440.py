u = []
t = input()
tt = t.split(' ')
for i in range(len(tt)):
    j = int(tt[i])
    u.append(j)
u.sort()
if 5 >= len(u):
    y = u.pop()
    print(y)
else:
    print("Too much input!")