s = input()
l = []
o = ''
for c in s:
    if not c in l:
        l.append(c)
        o = o + ', ' + c

print(o[2:])        

