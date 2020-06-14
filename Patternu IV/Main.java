#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int n,i,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=n;j++)
    {
      if(i%2!=0)
      {
        if(j==n)
        {
          std::cout<<i+1;
        }
        else
        {
          std::cout<<i;
        }
      }
      else
      {
        if(j==1)
        {
          std::cout<<i+1;
        }
        else
        {
          std::cout<<i;
        }
      }
    }
    std::cout<<"\n";
  }
        
  
    return 0;
}