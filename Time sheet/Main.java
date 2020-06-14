#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int s,m,t,w,th,f,sa;
  int r1,r2,r3,r4,r5,r6,r7,r8=0,edays,bonus,bonusrate,totalhours,totalamount;
  std::cin>>s>>m>>t>>w>>th>>f>>sa;
  r1=s*150;
  r2=sa*125;
  if(m<=8)
  {
    r3=m*100;
  }
  else
  {
    bonus=m-8;
    bonusrate=bonus*115;
    r3=bonusrate+800;
  }
  if(t<=8)
  {
    r4=t*100;
  }
  else
  {
    bonus=t-8;
    bonusrate=bonus*115;
    r4=bonusrate+800;
  }
  if(w<=8)
  {
    r5=w*100;
  }
  else
  {
    bonus=w-8;
    bonusrate=bonus*115;
    r5=bonusrate+800;
  }
  if(th<=8)
  {
    r6=th*100;
  }
  else
  {
    bonus=th-8;
    bonusrate=bonus*115;
    r6=bonusrate+800;
  }
  if(f<=8)
  {
    r7=f*100;
  }
  else
  {
    bonus=f-8;
    bonusrate=bonus*115;
    r7=bonusrate+800;
  }
  totalhours=m+t+w+th+f;
  if(totalhours>40)
  {
    edays=totalhours-40;
    r8=edays*125;
  }
  totalamount=r1+r2+r3+r4+r5+r6+r7+r8;
  std::cout<<totalamount;
  
  
  
  
  
  
}