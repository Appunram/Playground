#include<iostream>
using namespace std;
int eom(int n,int a[])
{
  int es=0,os=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      es++;
    else
      os++;
  }
  return es;
}
int oem(int n,int a[])
{
  int es=0,os=0;
  for(int i=0;i<n;i++)
  {
    if(a[i]%2==0)
      es++;
    else
      os++;
  }
  return os;
}
int main()
{
  //Type your code here.
  int n;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  int a[n];
  std::cout<<"\nEnter the elements in the array";
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int b=eom(n,a);
  int c=oem(n,a);
  if(b==n)
    std::cout<<"\nThe array is Even";
  else if(c==n)
    std::cout<<"\nThe array is Odd";
  else
    std::cout<<"\nThe array is Mixed";
}