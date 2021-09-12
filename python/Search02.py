def orderedsequentialSearch(alist, item): #ถ้า list ที่ต้องการค้นหาเรียงตามลําดับ
    pos = 0 
    found = False
    stop = False
    
    while pos < len(alist) and not found and not stop:
        if alist[pos] == item:
            found = True
        else:
            if alist[pos] > item:
                stop = True
            else:
                pos = pos+1
            
    return found

testlist = [1, 2, 32, 8, 17, 19, 42, 13, 0]
print(orderedsequentialSearch(testlist, 3))  
print(orderedsequentialSearch(testlist, 13))         