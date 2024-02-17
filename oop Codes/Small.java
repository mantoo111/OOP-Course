import java.util.Scanner;
class Small{
public static void main(String[] args){
Scanner inp= new Scanner(System.in);
System.out.println("enter the number");
int a=inp.nextInt();
System.out.println("enter the number");
int b=inp.nextInt();
System.out.println("enter the number");
int c=inp.nextInt();

if(a<b&&a<c)

System.out.println("smallest no. is"+a);
if(b<a&&b<c)
System.out.println("smallest no. is"+b);
if(c<a&&c<b)
System.out.println("smallest no. is"+c);
}
}





