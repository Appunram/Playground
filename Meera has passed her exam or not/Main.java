#include<iostream>
int main()
{
  // Type your code here
  int n,i,b,flag=0;
  std::cin>>n;
  int a[n];
  for( i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  std::cin>>b;
  for(i=0;i<n;i++)
  {
    if(a[i]==b)
    {
      flag=1;
    }
  }
  if(flag==1)
  {
    std::cout<<"She passed her exam";
  }
  else
  {
    std::cout<<"She failed";
  }
  
      
  
  
}