l = str(input())
u = ''
if l.count("1") == l.count("0"):
    for i in range(l.count("1")):
        u += '10'
print(u)
