#include<iostream>
void swap(int &a,int &b)
{
  a=a+b;
  b=a-b;
  a=a-b;
}
int main()
{
  int a,b;
  std::cin>>a;
  std::cin>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<"\n";
  swap(a,b);
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
}