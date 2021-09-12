L = input().split(' ')
s = L[0]
n = int(L[1])

len_s = len(s)

output_s = ''
mySum = 0

for i in range(0,len_s,n):
	if i + n > len_s:
		x = len_s
	else:
		x = i + n
	mySum += int(s[i:x])
	output_s += s[i:x] + " "

print(output_s)
print(mySum)