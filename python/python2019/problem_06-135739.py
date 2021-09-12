number=input().split(' ')
max=-55555
if len(number)<6:
    for i in range(0,len(number)):
         if int(number[i])>max:
            max=int(number[i])
    print(max)
else:
    print('Too much input!')