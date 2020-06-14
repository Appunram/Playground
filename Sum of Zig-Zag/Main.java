#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,row1=0,dia=0,col=0,sum=0;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
    for(i=0;i<=0;i++)
    {
      for(j=0;j<c-1;j++)
      {
        row1=row1+a[i][j];
      }
    }
  for(j=c-1;j==c-1;j--)
  {
    for(i=0;i<r;i++)
    {
      col=col+a[j][i];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if((i+j)==(r-1))
      {
        dia+=a[i][j];
      }
      if(j==0&&i==r-1)
        col=col-a[i][j];
    }
  }
  std::cout<<"Sum of Zig-Zag pattern is "<<dia+row1+col;
        
  
}