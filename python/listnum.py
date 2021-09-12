num =list(input())
L1 = []
L2 = []
for i in num:
    if not i in L1:
      L1.append(int(i))
for i in L2:
    if (not i in L2) and (i%2==0):
      L2.append(int(i))
L2.sort()
print(L2)      