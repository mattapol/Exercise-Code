gcd = 1
lcm = 0

a = list(map(int,input().split("and")))

x = a[0] 
y = a[1]

def lcm(x, y):
    if x > y:
        greater = x
    else:
        greater = y
    while(True):
        if((greater % x == 0) and (greater % y == 0)):
            lcm = greater
            break
        greater += 1
    return lcm    
print("The lcm of ",a[0]," and ",a[1]," is: ",lcm(x,y))      
      
