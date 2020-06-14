#include<iostream>
int fib(int n)
{
  if((n==1)||(n==0))
  {
    return(n);
  }
  return(fib(n-1)+fib(n-2));
}
int main()
{
  //Type your code here.
  int n,i=0;
  std::cin>>n;
  std::cout<<"The term "<<n<<" in the fibonacci series is "<<fib(n-1);
  
}