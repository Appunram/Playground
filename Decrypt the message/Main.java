#include<iostream>
int main()
{
  int a,b,c,sum=0;
  std::cin>>a>>b;
  c=a+b;
  for(int i=1;i<c;i++)
  {
    if(c%i==0)
    {
      sum=sum+i;
    }
  }
  if(sum==c)
  {
    std::cout<<"They can read the message";
  }
  else
  {
    std::cout<<"They can't read the message";
  }
}