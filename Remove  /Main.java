#include<iostream>
#include<cstring>
using namespace std;
int main()
{
  //Type your code here.
  char str[100],two[10][30];
  char str1[]="the";
  int i=0,j=0,k=0,len1=0,len2=0;
  std::cin.getline(str,100);
  for(i=0;str[i]!='\0';i++)
  {
    if(str[i]==' ')
    {
      two[k][j]='\0';
      k++;
      j=0;
    }
    else
    {
      two[k][j]=str[i];
      j++;
    }
  }
  two[k][j]='\0';
  j=0;
  for(i=0;i<k+1;i++)
  {
    if(strcmp(two[i],str1)==0)
    {
      two[i][j]='\0';
    }
  }
  j=0;
  for(i=0;i<k+1;i++)
  {
    if(two[i][j]=='\0')
    {
      continue;
    }
    else
    {
      std::cout<<two[i]<<" ";
    }
  }
}