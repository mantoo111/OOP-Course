import java.util.Scanner;
class Large{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);
System.out.println("enter 1 number");
int a=inn.nextInt();
System.out.println("enter 2 number");
int b=inn.nextInt();
System.out.println("enter 3 number");
int c=inn.nextInt();
System.out.println("enter 4 number");
int d=inn.nextInt();

if(a>b&&a>c&&a>d)

System.out.println("largest no. is"+a);
if(b>a&&b>c&&b>d)
System.out.println("largest no. is"+b);
if(c>a&&c>b&&c>d)
System.out.println("largest no. is"+c);
if(d>a&&d>b&&d>c)
System.out.println("largest no. is"+d);
}
}


