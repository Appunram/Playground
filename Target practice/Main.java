#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int target,score,attempt=0,sum=0;
  std::cin>>target;
  while(sum<target)
  {
    std::cin>>score;
    sum=sum+score;
    attempt++;
  }
  std::cout<<"The number of turns is "<<attempt<<"\n";
}