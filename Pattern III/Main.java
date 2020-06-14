#include<iostream>
int main()
{
  int n,i,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      if(i>j)
      {
        std::cout<<i<<"*";
      }
      else
      {
        std::cout<<i;
      }
    }
    std::cout<<"\n";
  }
  for(i=n;i>0;i--)
  {
    for(j=1;j<=i;j++)
    {
      if(i>j)
      {
        std::cout<<i<<"*";
      }
      else
      {
        std::cout<<i;
      }
    }
    std::cout<<'\n';
  }
    
}