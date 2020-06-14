#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int fa,fd,fe,sa,sd,se,aa,ad,ae;
  std::cin>>fa>>fd>>fe>>sa>>sd>>se>>aa>>ad>>ae;
  int tfa=fa-(fa*fd/100)+fe;
  int tsa=sa-(sa*sd/100)+se;
  int taa=aa-(aa*ad/100)+ae;
  std::cout<<"In Flipkart Rs."<<tfa<<"\n";
  std::cout<<"In Snapdeal Rs."<<tsa<<"\n";
  std::cout<<"In Amazon Rs."<<taa<<"\n";
  if (tfa<=tsa && tfa<=taa)
    std::cout<<"He will prefer Flipkart";
  else if(tsa<=tfa && tsa<=taa)
    std::cout<<"He will prefer Snapdeal";
  else
    std::cout<<"He will prefer Amazon";
    
}