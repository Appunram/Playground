#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float t;
  float b=10.15,c=13.30,d=18.00,e=22.00;
  std::cin>>a>>t;
  if(a>=13)
  {
    if(t==c||t==d)
    {
      std::cout<<"$5.00";
    }
    else
    {
      std::cout<<"$8.00";
    }
  }
  else if (a<13)
  {
    if(t==c||t==d)
    {
      std::cout<<"$2.00";
    }
    else
    {
      std::cout<<"$4.00";
    }
  }
}

    

      
 
