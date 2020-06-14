#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,es=0,os=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    if(a[i]%2==0)
      es+=a[i];
    else
      os+=a[i];
  }
  std::cout<<"The sum of the even numbers in the array is "<<es<<"\n";
  std::cout<<"The sum of the odd numbers in the array is "<<os;
}