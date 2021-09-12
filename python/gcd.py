gcd = 1
lcm = 0

a = list(map(int,input().split(' ')))

x = abs(a[0]) 
y = abs(a[1])

while y != 0:
      t = y; 
      y = x%y;
      x = t;
      
gcd = x;


print("The gcd of "+str(a[0])+" and "+str(a[1])+" is: "+str(gcd))      
      
