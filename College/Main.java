#include<iostream>
#include<string>
#include<bits/stdc++.h>
using namespace std;
struct college
{
  char name[100];
  char city[100];
  int ey;
  float pp;
};
int main()
{
  int n,i,j;
  std::cout<<"Enter the number of colleges";
  std::cin>>n;
  char x[n][30];
  char t[30];
  college s[n];
  for(i=0;i<n;i++)
  {
    std::cout<<"\nEnter the details of college "<<i+1;
    std::cout<<"\nEnter name";
    std::cin.ignore();
    std::cin.getline(s[i].name,100);
    strcpy(x[i],s[i].name);
    std::cout<<"\nEnter city";
    std::cin>>s[i].city;
    std::cout<<"\nEnter year of establishment";
    std::cin>>s[i].ey;
    std::cout<<"\nEnter pass percentage";
    std::cin>>s[i].pp;
  }
  for(i=0;i<n;i++)
  {
    for(j=0;j<n-i-1;j++)
    {
      if(strcmp(x[j],x[j+1])>0)
      {
        strcpy(t,x[j]);
        strcpy(x[j],x[j+1]);
        strcpy(x[j+1],t);
      }
    }
  }
  std::cout<<"\nDetails of colleges";
  for(i=0;i<n;i++)
  {
    for(j=0;j<n;j++)
    {
      if(strcmp(x[i],s[j].name)==0)
      {
        std::cout<<"\nCollege:"<<i+1;
        std::cout<<"\nName:"<<s[j].name;
        std::cout<<"\nCity:"<<s[j].city;
        std::cout<<"\nYear of establishment:"<<s[j].ey;
        std::cout<<"\nPass percentage:"<<s[j].pp;
        break;
      }
    }
  }
}
    
    
      
    
      
         
