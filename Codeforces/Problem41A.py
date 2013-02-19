#41A: a "translation" is a word reversal
#given two words, calculate if the translation is correct

import sys

param = sys.stdin.readlines()
w1 = reversed(param[0][0:-1])
w2 = (param[1][0:-1])

count = 0

if(len(w2) != len(param[0][0:-1])):
  print "NO"
else:
  for i in w1:
    if ( not i == w2[count] ):
      count = -10
      break
    count = count + 1

  if(count == -10):
    print "NO"
  else:
    print "YES"
