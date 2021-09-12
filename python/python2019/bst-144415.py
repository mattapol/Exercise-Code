node=list(map(int,input().split(',')))
aleft=[]
aright=[]
for i in range(1,len(node)):
    if node[i]>node[0]:
        aright.append(node[i])
    else:
        aleft.append(node[i])
if aleft and aright:
    print('True')
else:
    print('False')
