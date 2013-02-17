#n groups of schoolchildren
# the i'th group has 1 <= s_i <= 4 friends
# each taxi can take up to 4 people
# determine min # of taxis if groups can't be split up
import sys

""" Solve Problem 158B """
params = sys.stdin.readlines()
n =int(params[0])
s = params[1].split(' ')
count = 0
passengers = 0
threes = 0
twos = 0
ones = 0

for i in range(n):
  s[i] = int(s[i])
  if(s[i] == 4):
    count = count + 1
  elif(s[i] == 3):
    count = count + 1
    ones = ones - 1
  elif(s[i] == 2):
    twos = twos + 1
  elif(s[i] == 1):
    ones = ones + 1
count = count + twos/2
twos = twos%2

if(twos > 0):
  count = count + twos
  ones = ones - 2

if(ones < 0):
  ones = 0

count = count + ones/4
ones = ones%4

if(ones > 0):
  count = count + 1

print count
