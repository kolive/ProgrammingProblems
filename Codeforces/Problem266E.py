#More Queries to Array

import sys

class AssignQuery:
  def __init__(self, value, length):
    self.value = value
    self.count = 0
    self.length = length
  def __iter__(self):
    return self
  def next(self):
    if(self.count <= self.length):
      self.count = self.count + 1
      return self.value
    else:
      raise StopIteration


def sum(array, k):
  it = iter(array)
  accum_value = 0
  count = 0
  for x in it:
    accum_value = summation(accum_value, x, count, k)
    count = count + 1
  return accum_value 

def summation(accum_value, next_value, count, k):
  next_value = next_value * (count+1)**k
  return (accum_value + next_value) % 1000000007

params = sys.stdin.readlines()

n = params[0].split(' ')[0]
m = params[0].split(' ')[1]

array = params[1].split(' ')

for i in range(len(array)):
  array[i] = int(array[i]) % 1000000007

for i in range(int(m)):
  query = params[2+i].split(' ')
  qt = query[0]
  ql = int(query[1]) - 1
  qr = int(query[2]) - 1
  qv = int(query[3])
  if(query[0] == "?"):
    #sum
    print sum(array[ql:qr+1], qv)
  elif(query[0] == "="):
    #assign
    tmp = AssignQuery(qv, qr - ql)
    array[ql:qr+1] = iter(tmp)
