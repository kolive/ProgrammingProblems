# Given an array of n integers
# count how many integers are greater or equal to array[k] && > 0

import sys
import fractions

params = sys.stdin.readlines()
params = params[0].split(' ')
a = int(params[0])
b = int(params[1])
n = int(params[2])

turn = 0
g = 0

while (n >= 0):
  if turn == 0:
    g = fractions.gcd(a,n)
    turn = 1
    if( g > n):
      print turn
      break
  else:
    g = fractions.gcd(b,n)
    turn = 0
    if(g > n):
      print turn
      break
  n = n - g  
