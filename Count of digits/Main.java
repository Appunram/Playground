#include<iostream>
int main()
{
  // Type your code here
  int n,a,count=0;
  std::cin>>n;
  do
  {
    a=n%10;
    n=n/10;
    count=count+1;
  }
  while(n>0);
  std::cout<<count;
    
}