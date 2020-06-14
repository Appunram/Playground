#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,sum=0;
  std::cin>>n;
  int val=n;
  while(n!=0)
  {
    sum=sum+(n%10);
    n=n/10;
  }
  if(val%sum==0)
  {
    std::cout<<"Harshad Number";
  }
  else
  {
    std::cout<<"Not Harshad Number";
  }
}