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
params = sys.stdin.readlines()

n = params[0].split(' ')[0]
m = params[0].split(' ')[1]

array = params[1].split(' ')

for i in range(len(array)):
  array[i] = int(array[i])

print array
for i in range(int(m)):
  query = params[2+i].split(' ')
  qt = query[0]
  ql = int(query[1])
  qr = int(query[2])
  qv = int(query[3])
  if(query[0] == "?"):
    #sum
    print "x"
  elif(query[0] == "="):
    #assign
    tmp = AssignQuery(qv, qr - ql)
    array[ql:qr] = iter(tmp)
