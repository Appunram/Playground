#include<iostream>
#include<cstdlib>
int main(){
  // Type your code here
  int *p;
  int n,i,m=0,w=0;
  std::cin>>n;
  p=(int *)malloc(n*sizeof(int));
  for(i=0;i<n;i++)
  {
    std::cin>>*(p+i);
    if(*(p+i)%2==0)
    {
      w++;
    }
    else if(*(p+i)%2!=0)
    {
      m++;
    }
  }
  std::cout<<m<<"\n";
  std::cout<<w;
  return 0;
  
}