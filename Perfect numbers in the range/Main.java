#include<iostream>
using namespace std;
bool isperfect(int no)
{
  int i=0;
  int sum=0;
  while(i++<no)
  {
    if(no%i==0&&i<no)
    {
      sum+=i;
    }
  }
  return sum==no;
}
int main()
{
  int a,b;
  std::cin>>a;
  std::cin>>b;
  for(int i=a;i<=b;i++)
  {
    if(isperfect(i))
    {
      std::cout<<i<<" ";
    }
  }
  return 0;
}
      
      