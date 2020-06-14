#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  char str[200];
  int symbols=0,vowels=0,ws=0,dig=0,cons=0;
  std::cin.getline(str,200);
  for(int i=0;str[i]!='\0';++i)
  {
    if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U')
    {
      ++vowels;
    }
    else if((str[i]>='a'&&str[i]<='z')||(str[i]>='A'&&str[i]<='Z'))
    {
      ++cons;
    }
    else if(str[i]>='0'&&str[i]<='9')
    {
      ++dig;
    }
    else if(str[i]==' ')
    {
      ++ws;
    }
    else
    {
      ++symbols;
    }
  }
  std::cout<<"Vowels:"<<vowels<<"\n";
  std::cout<<"Consonants:"<<cons<<"\n";
  std::cout<<"White Spaces:"<<ws<<"\n";
  std::cout<<"Digits:"<<dig<<"\n";
  std::cout<<"Symbols:"<<symbols<<"\n";
  
}