#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
  char caption[100];
  int count=0;
  std::cin.getline(caption,100);
  int len=strlen(caption);
  for(int i=0;i<len;i++)
  {
    if(caption[i]==' ')
    {
      count++;
    }
  }
  if((count+1)<=10)
  {
    std::cout<<"Caption eligible for the contest";
  }
  else
  {
    std::cout<<"Caption not eligible for the contest";
  }
    
   
}