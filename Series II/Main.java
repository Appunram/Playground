#include<iostream>
int main()
{
  int n,start=11;
  std::cin>>n;
  while(n--!=0)
  {
    int a=start*start;
    std::cout<<a<<" ";
    start+=4;
  }
}
  