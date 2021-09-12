inint = input()
number = inint.split(' ')
a=int(number[0])
b=int(number[1])
for x in range(1,a+1):
    if x%b==0:
        print(x)