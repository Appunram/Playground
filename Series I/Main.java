#include<iostream>
int main()
{
  int n;
  float start=0.5;
  std::cin>>n;
  while(n--!=0)
  {
    std::cout<<start<<" ";
    start*=3;
  }
}
  
  