#include<iostream>
using namespace std;
struct time
{
  int seconds;
  int minutes;
  int hours;
};
void dbtp(struct time t1,struct time t2,struct time *diff); 
int main()
{
  struct time st;
  struct time stp;
  struct time diff;
  std::cin>>st.hours>>st.minutes>>st.seconds;
  std::cin>>stp.hours>>stp.minutes>>stp.seconds;
  dbtp(st,stp,&diff);
  std::cout<<diff.hours<<":";
  std::cout<<diff.minutes<<":";
  std::cout<<diff.seconds;
}
void dbtp(struct time st,struct time stp,struct time *diff)
{
  while(stp.seconds>st.seconds)
  {
    --st.minutes;
    st.seconds+=60;
  }
  diff->seconds=st.seconds-stp.seconds;
  while(stp.minutes>st.minutes)
  {
    --st.hours;
    st.minutes+=60;
  }
  diff->minutes=st.minutes-stp.minutes;
  diff->hours=st.hours-stp.hours;
}
  
    