inp = list(map(int,input().split()))
power= str(inp[0]**inp[1])
middle= (len(power)//2)
left=int(middle-int(inp[2]//2))
right=int(middle+int(inp[2]//2))
print(power)
if  inp[2]==1:
    print(power[middle])
else:
    print(power[left:right])
