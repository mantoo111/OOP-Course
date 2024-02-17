import java.util.Scanner;
class Library{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);
int fine;
System.out.println("Enter day when book is return=");
int days=inn.nextInt();
if (days<=7)
	{
	System.out.println("the fine is 10 PKR per day");
	fine=days*10;
	System.out.println("The fine is:"+fine);
    }
	else if(days>=8 && days<=14)
	{
	System.out.println("the fine is 20 PKR per day");
	fine=days*20;
	System.out.println("The fine is:"+fine);
    }
	else if(days>= 14 && days<=31 ) 
	{
     System.out.println("The fine is 50 PKR per day ");
	fine=days*50;
	System.out.println("The fine is:"+fine);
    }	
	else 
	System.out.println("membership is cancelled"); 
	


}
}
