l = input()
u = ''
uu = ''
for i in range(l.count("1")):
        u += '1'
for i in range(l.count("0")):
        uu += '0'
print(uu + u)