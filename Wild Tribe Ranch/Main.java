#include<iostream>
int main()
{
  int w,mw;
  std::cin>>mw>>w;
  if(mw>w)
    std::cout<<"Yes, you can enter.";
  else if(w==mw)
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  else
    std::cout<<"Sorry, you can't enter";
}