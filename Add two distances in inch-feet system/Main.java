#include<iostream>
using namespace std;
struct distance
{
  int feet;
  float inch;
}d1,d2,sum;
int main()
{
  //Type your code here.
  std::cin>>d1.feet>>d1.inch>>d2.feet>>d2.inch;
  sum.feet=d1.feet+d2.feet;
  sum.inch=d1.inch+d2.inch;
  if(sum.inch>12)
  {
    ++sum.feet;
    sum.inch-=12;
  }
  std::cout<<sum.feet<<"'-"<<sum.inch<<"\"";
}
