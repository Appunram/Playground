#include <iostream>
int main()
{
  char str[100], rev[100];     
  int count = 0, end, i;    
  //Your code goes here  
  std::cin.getline(str,100);
  for(i=0;str[i]!='\0';i++)
    count+=1;
  end=count;
  for(i=0;i<end;i++)
  {
    rev[i]=str[count-1];
    count--;
  }
  
  std::cout<<rev;
}