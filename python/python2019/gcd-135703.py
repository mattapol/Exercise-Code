def gcdx(x,y):
    while y!=0:
        (x,y)=(y,x%y)
    return x
imp=list(map(int,input().split()))
print('The gcd of %d and %d is: %d'%(imp[0],imp[1],gcdx(imp[0],imp[1])))
