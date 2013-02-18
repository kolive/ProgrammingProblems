# Given an array of n integers
# count how many integers are greater or equal to array[k] && > 0

import sys

params = sys.stdin.readlines()
n = int(params[0].split(' ')[0])
k = int(params[0].split(' ')[1])-1
array = params[1].split(' ')
count = 0
limit = int(array[k])


#minimum numbers of winners are the higher scores ahead of time
if limit > 0:
  count = count + k
  #might be ties after k 
  index = k  
  while index < len(array) and int(array[index]) == limit :
    count = count + 1
    index = index + 1
else:
  while k >= 0 and int(array[k]) <= 0:
    k = k - 1
  count = k + 1
print count

