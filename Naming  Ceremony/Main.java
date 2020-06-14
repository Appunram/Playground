#include<iostream>
int main()
{
  char name[50];
  std::cin>>name;
  for(int i=0;name[i]!='\0';i++)
  {
      std::cout<<name[i];
  }
}