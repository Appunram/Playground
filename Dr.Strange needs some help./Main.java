#include<iostream>
int main()
{
  int m,n,ra;
  std::cin>>m>>n>>ra;
  int a=m;
  for(int i=1;i<n;i++)
  {
    a=a*m;
  }
  if(a<ra)
  {
    std::cout<<"Sorry Doctor! You need more bacteria.";
  }
  else
  {
    std::cout<<"Doctor, you can proceed with your experiment.";
  }
}