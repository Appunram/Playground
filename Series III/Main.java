#include<iostream>
int main()
{
  int n,i=0,start=6;
  std::cin>>n;
  while(n--!=0)
  {
    while(i++<=n)
    {
      std::cout<<start<<' ';
      start=start+5*i;
    }
  }
}
      