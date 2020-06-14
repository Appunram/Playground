#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  int a[n];
  std::cout<<"\nEnter the elements in the array";
  for( i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  int p,v;
  std::cout<<"\nEnter the location where you wish to insert an element";
  std::cin>>p;
  if(p>n)
    std::cout<<"\nInvalid Input";
  else
  {
    std::cout<<"\nEnter the value to insert";
    std::cin>>v;
    std::cout<<"\nArray after insertion is";
    for(i=0;i<p-1;i++)
    {
      std::cout<<"\n"<<a[i];
    }
    std::cout<<"\n"<<v;
    for(i=p-1;i<n;i++)
    {
      std::cout<<"\n"<<a[i];
    }
  }
}