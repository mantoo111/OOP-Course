import java.util.Scanner;
class Valid{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);
System.out.println("enter 1st angle");
int a=inn.nextInt();
System.out.println("enter 2nd number");
int b=inn.nextInt();
System.out.println("enter 3rd  number");
int c=inn.nextInt();
int sum=a+b+c;
if(sum==180)
System.out.println("triangle is valid");
else
System.out.println("triangle is not valid");


}
}
