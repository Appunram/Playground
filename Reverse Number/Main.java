#include <iostream>
int main() 
{
	// Type your code here
  int n,a;
  std::cin>>n;
  while (n>0)
  {
    a=n%10;
    n=n/10;
    std::cout<<a;
  }
	return 0;
}