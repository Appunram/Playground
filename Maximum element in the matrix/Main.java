#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,highest=0;
  std::cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(a[i][j]>highest)
      {
        highest=a[i][j];
      }
    }
  }
  std::cout<<"The maximum element is "<<highest;
}