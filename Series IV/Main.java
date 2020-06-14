#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  for(int i=1;i<=n;i++)
  {
    int b=i*i;
    if(b%2==0)
    {
      std::cout<<b-2<<' ';
    }
    else
    {
      std::cout<<b-1<<" ";
    }
  }
}
  
