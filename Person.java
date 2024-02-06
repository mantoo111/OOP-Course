class Person
{
int age;
String name;
void display(){
age=100;
name=&quot;Ali&quot;;
System.out.println(&quot;Age:&quot;+age+&quot;Name:&quot;+name);
}
public static void main(String[] args){
Person obj=new Person();
obj.age=290;
System.out.println(obj.age);
obj.name=&quot;John&quot;;
System.out.println(obj.name);
obj.display();
}
}