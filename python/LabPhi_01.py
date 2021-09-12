# -*- coding: utf-8 -*-
"""
Created on Wed Jul  1 13:17:25 2020

@author: Acer
"""
#Tom,23,Cat,35,Don,14,Bon,85,Zis,20
l = input()
ll = l.split(',')
print(ll)
minx = 100000
maxx = 100000
for i in range(1,10,2):
    if minx > int(ll[i]):
         minx =  int(ll[i])
minx = minx-1           
print(minx)   
    #if maxx < int(ll[i]):
     #    maxx = int(ll[i])
        

    
        
        