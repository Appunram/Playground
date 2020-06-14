a=int(input())
b=int(input())
if a>b:
  a=a+1900
  b=b+2000
  print(b-a)
else:
  a=a+2000
  b=b+2000
  print(b-a)