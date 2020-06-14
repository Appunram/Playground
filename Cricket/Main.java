#include<iostream>
#include<bits/stdc++.h>
using namespace std;
int main()
{
  //Type your code here.
  int tb,tr,cr,cb;
  std::cin>>tb>>tr>>cr>>cb;
  int to=tb/6;
  int o=cb/6;
  int f=cb%6;
  float of=((float)o+(float)f/10);
  float crr=cr/of;
  float trr=float(tr)/float(to);
  std::cout<<to<<"\n"<<of<<"\n"<<fixed<<setprecision(1)<<crr<<"\n"<<fixed<<setprecision(1)<<trr;
  if(crr>trr)
    std::cout<<"\nEligible to Win";
  else
    std::cout<<"\nNot Eligible to Win";
}