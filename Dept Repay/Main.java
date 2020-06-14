#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int p,y,roi,interest,ta;
  float d,fs;
  std::cin>>p>>y>>roi;
  interest=y*p*roi/100;
  ta=p+interest;
  d=float(interest)*2/100;
  fs=ta-d;
  std::cout<<interest<<"\n"<<ta<<"\n"<<d<<"\n"<<fs;
  
}