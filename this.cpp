#include<iostream>
#include<string.h>
using namespace std;
class Student{
private:
 string name;
 int age;
 int number;
public:
 Student(){
name="ansa";
age=19;
number=7654;
}
public:
void setName(string n){
name=n;
}
string getName(){
return name;
}
void setAge(int a){
age=a;
}
int getAge(){
return age;
}
void setNumber(int b){
number=b;

}
int getNumber(){
return number;
}
};

int main() {

Student s;
s.setName("asma");

cout<<(s.getName());
s.setAge(24);

cout<<(s.getAge());
s.setNumber(8970);

cout<<(s.getNumber());
return 0;
}


