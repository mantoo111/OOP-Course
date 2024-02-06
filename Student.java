
import java.util.Scanner;

class Student{
String name;
int reg_no;
int cgpa;
void read(){
System.out.println("name is "+name);
System.out.println("registation number is "+reg_no);
System.out.println("cgpa is "+cgpa);
}
void write(Scanner inp){
System.out.println("Enter the name");
 name=inp.nextLine();
System.out.println("Enter registration number");
reg_no=inp.nextInt();
System.out.println("Enter cgpa");
cgpa=inp.nextInt();
inp.nextLine();
}
public static void main(String[] args){

Scanner inp = new Scanner(System.in);
Student s1=new Student();
Student s2=new Student();
s1.write(inp);
s1.read();
s2.write(inp);
s2.read();
}
}