#include<iostream>
int main()
{
  int n,i,j,k=0,count=0;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    count=k;
    for(j=1;j<=i;j++)
    {
      if(i%2==0)
      {
        
        std::cout<<count+i;
        count-=1;
        if(j!=i)
        {
          std::cout<<"*";
        }
        k++;
      }
      else
      {
        count+=1;
        std::cout<<count;
        if(j!=i)
        {
          std::cout<<"*";
        }
        k++;
      }
    }
    std::cout<<"\n";
  }
}