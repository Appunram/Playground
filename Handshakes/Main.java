#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  std::cin>>n;
  for(int i=1;i<=n;)
  {
    sum=sum+(i*n-1);
    n--;
  }
  std::cout<<sum;
      
}