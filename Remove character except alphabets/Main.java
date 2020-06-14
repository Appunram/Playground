#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  std::string str;
  std::string temp="";
  std::getline(std::cin,str);
  for(int i=0;i<str.size();i++)
  {
    if(((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z')))
    {
      temp+=str[i];
    }
  }
  str=temp;
  std::cout<<str;
      
  
  
}