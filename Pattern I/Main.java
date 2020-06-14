#include<iostream>
int main()
{
  int n,i,j;
  std::cin>>n;
  for(i=1;i<=4;i++)
  {
    for(j=1;j<=i;j++)
    {
      std::cout<<n;
    }
    n++;
    std::cout<<"\n";
  }
  n--;
  for(i=4;i>=1;i--)
  {
    for(j=1;j<=i;j++)
    {
      std::cout<<n;
    }
    n--;
    std::cout<<"\n";
  }
}