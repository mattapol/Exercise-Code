l = input()
ll = l.split(",")
lll = len(ll)
u = []
uu = []

for i in range(1,lll,2):
    if int(ll[i]) < 21:
        u.append(ll[i-1])
    else:
        uu.append(ll[i-1])
        
u.sort()
uu.sort()

if len(u) > 0:
    print('1:' + ','.join(u) + ',')
if len(uu) > 0:
    print('2:' + ','.join(uu) + ',')