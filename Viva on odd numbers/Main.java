#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
    int num,n=0;
  float marks=0.0;
  do
  {
    std::cin>>num;
    if(num%2!=0&&num>0)
    {
      marks++;
      n++;
    }
    else if(num%2==0 && num>0)
    {
      marks=marks-0.5;
    }
    else if(num<0)
    {
      marks=marks-1.0;
      break;
    }
  }while(n<3);
 std::cout<<marks;
}