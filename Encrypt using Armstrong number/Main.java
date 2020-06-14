#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int temp=n,val=n,c=0,sum=0;
  while(n!=0)
  {
    int r=n%10;
    c+=1;
    n=n/10;
  }
  while(val!=0)
  {
    int a=val%10;
    sum=sum+power(a,c);
    val=val/10;
  }
  if(sum==temp)
    return 1;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}