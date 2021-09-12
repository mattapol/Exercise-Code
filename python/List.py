#S = 'abccba'
#L = list(S)
#print(L[-1])
#print(L[-2])
#print(L[1:-1])


def ab(LL):
    print(LL)
    if len(LL) <=1:
        return True    
    else:
        res = (LL[0] == LL[-1]) and ab(LL[1:-1])
        return res
L = list(input())
print(ab(L))    