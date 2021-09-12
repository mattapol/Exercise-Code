octal = input()
dec = str(int(octal, 8))
decm = int(dec)
x=bin(decm)
if int(octal)==2 or int(octal)==3:
    print('0'+x[2:])
elif(int(octal)<20):
    print('00'+x[2:])
else:
    print('0'+x[2:])