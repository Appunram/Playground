#include<iostream>
using namespace std;
int sqr(int a,int n)
{
  if(n==1)
    return(a);
  return a*sqr(a,n-1);
}
int main()
{
  //Type your code here.
  int a,n;
  std::cin>>a;
  std::cin>>n;
  std::cout<<"Enter the value of a"<<"\n";
  std::cout<<"Enter the value of n"<<"\n";
  std::cout<<"The value of "<<a<<" power "<<n<<" is "<<sqr(a,n);


}