#include<iostream>
int main()
{
  // Type your code here
  int n,highest=0;
  std::cin>>n;
  int a[n];
  for(int i=0;i<n;i++)
  {
    std::cin>>a[i];
    if(a[i]>highest)
    {
      highest=a[i];
    }
  }
  std::cout<<highest;
  
}