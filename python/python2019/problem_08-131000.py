string = input()
myList = list(dict.fromkeys(string.lower()))
myList.sort(reverse=False)
myPrint=''
for i in range(0,len(myList)):
    myPrint +=myList[i]
print(myPrint)
