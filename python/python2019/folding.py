L=input().split(' ')
s=L[0]
n=int(L[1])
len_s=len(s)
n_loop=len_s//n
listans=[]
st=''
result=0
for i in range(0,len_s,n):
    if i+n>len_s:
        x=len_s
    else:
        x=i+n
    listans.append(s[i:x])
for i in listans:
    result+=int(i)
print(" ".join(listans))
print(result)
