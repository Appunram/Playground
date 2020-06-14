#include<iostream>
int main()
{
    // Type your code here
  int r,c,i,j;
  std::cin>>r;
  std::cin>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      std::cout<<a[j][i]<<" ";
    }
    std::cout<<"\n";
  }
  
  
}