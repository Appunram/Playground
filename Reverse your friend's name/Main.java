#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  std::string name;
  std::getline(std::cin,name);
  for(std::string::reverse_iterator i=name.rbegin();i<name.rend();i++)
  {
    std::cout<<*i;
  }
}