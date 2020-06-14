#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,start=11;
  std::cin>>n;
  while(n--!=0)
  {
    int a=start*start;
    std::cout<<a<<" ";
    start=start+4;
  }
}