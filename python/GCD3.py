import functools
def gcd(a,b):
    def factArr(x):
        list = []
        i=2
        while i <= x:
            if (x % i) == 0:
                list.append(i)
                x = x/i
                i = 2
            else:
                i = i+1
        return list
    aArr = factArr(a);
    bArr = factArr(b);
    print("aArr",aArr,"bArr",bArr)
    cArr = []
    for v in aArr:
        if v in bArr:
            cArr.append(v)
            bArr.remove(v)
    print("cArr",cArr)
    return functools.reduce(lambda x, y: x*y, cArr)
gcd(72,36)