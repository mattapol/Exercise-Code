x=input()
k=0
for i in x:
   k+=int(i)
m=str(k)
if len(m)>1:
    k=0
    for i in m:
        k+=int(i)
print(k) 