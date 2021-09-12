text = input()
a=[]
while (text != 'quit'):
	a.append(text)
	text = input()
for i in range(len(a)-1,-1,-1):
	print(a[i])