import java.util.Scanner;
class Calculation{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);
System.out.println("enter operation");
char op=inn.next().charAt(0);
System.out.println("enter 1st number");
int b=inn.nextInt();
System.out.println("enter 2nd  number");
int c=inn.nextInt();
switch(op){
case'+':
System.out.println("addition of 2 number is"+(b+c));
break;
case'-':
System.out.println("subtraction of 2 number is"+(b-c));
break;
case'*':
System.out.println("multiplication of 2 number is"+(b*c));
break;
case'/':
System.out.println("division of 2 number is"+(b/c));
break;
default:
System.out.println("invalid operation");

}
}
}
