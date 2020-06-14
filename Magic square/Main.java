#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,j,d1=0,d2=0;
  std::cin>>n;
  int a[n][n];
  for(i=0;i<n;i++)
    for(j=0;j<n;j++)
      std::cin>>a[i][j];
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(i==j)
      {
        d1=d1+a[i][j];
      }
      if(i+j+1==n)
      {
        d2=d2+a[i][j];
      }
    }
  }
  if(d1==d2)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
  
  
        
  
}