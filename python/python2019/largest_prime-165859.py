primenumber=[]
lower = 1
upper = 1000
for num in range(lower,upper + 1):
   # prime numbers are greater than 1
   if num > 1:
       for i in range(2,num):
           if (num % i) == 0:
               break
       else:
           primenumber.append(num)
x=int(input())
a=[]
for i in primenumber:
    if x%i==0:
        a.append(i)
m=a[-1:]
print(m[0])
