#include<iostream>
int main()
{
  int a,b,c,ans,small;
  std::cin>>a>>b>>c>>ans;
  if(a<b&&a<c)
  {
    small=a;
  }
  else if(b<a&&b<c)
  {
    small=b;
  }
  else
  {
    small=c;
  }
  while(small>=1)
  {
    if(a%small==0&&b%small==0&&c%small==0)
    {
      if(ans==small)
      {
        std::cout<<"Answer is correct.";
      }
      else
      {
        std::cout<<"Answer is wrong.";
      }
      break;
    }
    small--;
  }
}
      
  
