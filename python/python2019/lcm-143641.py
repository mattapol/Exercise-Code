def gcdx(x,y):
    while y!=0:
        (x,y)=(y,x%y)
    return x
def lcm(x,y):
    if x<0:
        x=abs(x)
    return x * y / gcdx(x, y)
imp=list(map(int,input().split('and')))
print('The lcm of %d and %d is: %d'%(imp[0],imp[1],lcm(imp[0],imp[1])))
