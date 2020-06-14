#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,n,i,j;
  std::cin>>m>>n;
  int a[m][n];
  for(i=0;i<m;i++)
  {
    for(j=0;j<n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(i=0;i<n;i++)
  {
    int max=a[0][i];
    for(j=1;j<m;j++)
    {
      if(a[j][i]>max)
      {
        max=a[j][i];
      }
    }
    std::cout<<max<<"\n";
  }
  
    
      
  
}