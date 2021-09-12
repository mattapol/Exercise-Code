num = int(input())
if(num <= 100):
    print(num*8)
elif(num > 100 and num <= 300):
    num = num-100
    print(num*10+800)
else:
    num = num-300 
    print(num*12+2800)    