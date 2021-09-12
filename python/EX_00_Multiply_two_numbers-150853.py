# -*- coding: utf-8 -*-
"""
Created on Wed Jul  8 14:49:58 2020

@author: pt280
"""

l = input()

ll = l.split(' ')
x = float(ll[0])
y = float(ll[1])
z = x * y
print('%.2f' %(x),'*','%.2f' %(y),'= %.2f' %(z))