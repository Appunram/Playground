#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int t1=0,t2=1,nextterm=0,n;
  std::cin>>n;
  for(int i=2;i<n;i++)
  {
    nextterm=t1+t2;
    t1=t2;
    t2=nextterm;
  }
  std::cout<<nextterm;
    
}