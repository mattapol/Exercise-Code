inp=input().split(',')
di=[]
d=0
ali=[]
ai=0
al=[]
a=0
sp=[]
s=0
leng=[]
l=0
for j in range(len(inp)):
    for i in inp[j]:
        if i in 'ABCDEFGHIJKLMNOPQRSTUVWXYZ':
            a+=1
        elif i in 'abcdefghijklmnopqrstuvwxyz':
            ai+=1
        elif i.isdigit():
            d+=1
        elif i in '@#$':
            s+=1
        else:
            break
        l+=1
    di.append(d)
    ali.append(ai)
    al.append(a)
    sp.append(s)
    leng.append(l)
    (d,a,s,l)=(0,0,0,0)

st=''
for i in range(len(inp)):
    if di[i]>=1 and al[i]>=1 and ali[i]>=1 and sp[i]>=1 and (leng[i]>=6 or leng[i]<=12):
        st+=inp[i]+','
s=list(st)
if not st=='':
    s.pop()
st= "".join(s)

print(st)    
