x= list(map(int,input().split()))
x.sort()
counts = dict()
for i in x:
  counts[i] = counts.get(i, 0)+1

print(counts)