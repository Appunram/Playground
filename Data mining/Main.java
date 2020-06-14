#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,es=0,os=0;
  std::cin>>n;
  while(n!=0)
  {
    int a=n%10;
    if(a%2==0)
    {
      es=es+a;
    }
    else
    {
      os=os+a;
    }
    n=n/10;
  }
  if(os==es)
  {
    std::cout<<"Yes";
  }
  else
  {
    std::cout<<"No";
  }
}