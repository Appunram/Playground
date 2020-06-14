#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int d1,c1,d2,c2,d,c;
  std::cin>>d1>>c1>>d2>>c2;
  d=d1+d2;
  int a=(c1+c2)/100;
  d=d+a;
  c=(c1+c2)%100;
  std::cout<<d<<"\n"<<c;
  
}