class Car1{
String name;
int model;
String color;
int price;
int year;
void display(){
name="swift";
model=345;
color="silver";
price=2000000;
year=2019;
System.out.println(name +model+color+price+year);

}
public static void main(String[] args){

Car obj=new Car();
obj.display();
}
}