# -*- coding: utf-8 -*-
"""
Created on Sun Jul 12 16:05:01 2020

@author: Acer
"""

number = input()
alist = number.split()
a = alist[0]
b = int(a)
if int(alist[1]) > 1 :
    print("Too much input!")
else:
    for i in range(1,13) :
       print(" %d X %d = %d "%(b,i,b*i))
