def gcd(m, n):  
    if m == 0 : 
        return n  
      
    return gcd(n%m, m) 

m = 72
n = 36
print("gcd(", m , "," , n, ") = ", gcd(m, n)) 
  

