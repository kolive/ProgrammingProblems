# find the first not matching number in evenness
import sys

param = sys.stdin.readlines()[1].split(' ')
even =int( param[0] )%2
index = 0

#if the first number is the different one
if( even != int(param[1])%2 ):
  #check to make sure the 2nd number isnt different
  if(even != int(param[2])%2):
    print 1
  else:
    print 2
else:
  for i in param:
    if(even != int(i)%2):
      print index+1
      break
    index = index + 1


