#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int pin,a,b,c;
  std::cin>>pin;
  a=pin/1000%10;
  b=pin%10;
  c=a+b;
  std::cout<<c;
  
}