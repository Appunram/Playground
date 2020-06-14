#include<iostream>
using namespace std;
struct employee
{
  char name[30];
  int id;
  int age;
  char designation[20];
  int salary;
};
int main()
{
  employee s[5];
  std::cout<<"Enter name:";
  std::cin>>s[0].name;
  std::cout<<"\nEnter ID:";
  std::cin>>s[0].id;
  std::cout<<"\nEnter age:";
  std::cin>>s[0].age;
  std::cout<<"\nEnter designation:";
  std::cin>>s[0].designation;
  std::cout<<"\nEnter Salary:";
  std::cin>>s[0].salary;
  std::cout<<"\nEmployee Details";
  std::cout<<"\nName of the Employee : "<<s[0].name;
  std::cout<<"\nID of the Employee : "<<s[0].id;
  std::cout<<"\nAge of the Employee : "<<s[0].age;
  std::cout<<"\nDesignation of the Employee : "<<s[0].designation;
  std::cout<<"\nSalary of the Employee : "<<s[0].salary;
}