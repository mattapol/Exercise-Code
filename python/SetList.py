S1 = set(input())
S2 = set(input())
L1 = []
for i in S1:
    if not i in S2:
        L1.append(i)
for i in S2:
    if not i in S1:
        L1.append(i)
print(L1)        