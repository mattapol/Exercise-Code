# -*- coding: utf-8 -*-
"""
Created on Sat Jul 11 22:25:40 2020

@author: Acer
"""

N=(int)(input("Enter Number: "))
for x in range(1,N+1):
    if(N%x==0):
        print(x)