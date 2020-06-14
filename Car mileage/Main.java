#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int m,l,d;
  std::cin>>m>>l>>d;
  if(d<m*l)
    std::cout<<"Can reach";
  else
    std::cout<<"Cannot reach";
}