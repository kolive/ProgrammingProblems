#determine winning team where each line represents a goal
import sys

param = sys.stdin.readlines()
a = 0
b = 0
hometeam = param[1]
awayteam = "-1"
for i in param[1:]:
    if i == hometeam:
      a = a + 1
    else:
      awayteam = i
      b = b + 1
if(a > b):
  print hometeam
else:
  print awayteam
