#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,s,i,ai,sum=0;
  std::cin>>n>>s;
  for(i=1;i<=n;i++)
  {
    std::cin>>ai;
    sum+=ai;
  }
  if(sum<=s)
  {
    std::cout<<"YES";
  }
  else
  {
    std::cout<<"NO";
  }
  
}