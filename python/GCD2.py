def gcd(a,b):
    if (a>b):
        r1=a
        r2=b
    else:
        r1=b
        r2=a   
    if(r1%r2==0):
        print (r2)
    else:
        gcd(r2, r1%r2)
a= int(input("Enter a number"))
b= int(input("Enter a number"))
gcd(a,b)