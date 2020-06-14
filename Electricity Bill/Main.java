#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int units;
  std::cin>>units;
  if(units<=200)
    std::cout<<"Rs."<<int(units*0.5);
  else if(units<=400)
    std::cout<<"Rs."<<units*0.65+100;
  else if(units<=600)
    std::cout<<"Rs."<<units*0.80+200;
  else
    std::cout<<"Rs."<<units*1.25+425;
}