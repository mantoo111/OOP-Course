import java.util.Scanner;
class Calculator{
void sum(int a,int b)
{
System.out.println("The sum of the numbers is:"+a+b);
}
void sub(int a,int b)
{
System.out.println("The sub of the numbers is:"+a-b);
}
void mul(int a,int b)
{
System.out.println("The prod of the numbers is:"+a*b);
}
void diff(int a,int b)
{
System.out.println("The diff of the numbers is:"+a/b);
}
public static void main(String[] args)
{
Scanner inn=new Scanner(System.in);
Calculator obj=new Calculator();
System.out.println("Enter the number=");
int a=inn.nextInt();
System.out.println("Enter the number=");
int b=inn.nextInt();
System.out.println("enter the operater");
char op=inn.next().charAt(0);    
switch(op)
{
case'+':
obj.sum(a,b);
break;

case'-':
obj.sub(a,b);
break;
case'*':
obj.mul(a,b);
break;
case'/':
obj.diff(a,b);
break;
default:
System.out.println("You enter wrong operator");	
}
}
}
