#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.;
  char str[50];
  char str1[50];
  std::cin>>str>>str1;
  int a=strcmp(str,str1);
  if(a==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
  
  
}