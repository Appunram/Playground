#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int i;
  float h,a;
  std::cin>>i>>h;
  switch(i)
  {
    case 2:
      a=(h*50/100)+h;
      std::cout<<a;
      break;
    case 3:
      a=(h*100/100)+h;
      std::cout<<a;
      break;
    default:
      std::cout<<"Number of items is more";
      break;
  }

}