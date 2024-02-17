import java.util.Scanner;
class Power{

int p(int n,int exp)
{
	if(exp==0)
	{
	
	return 1;
}
	return n*p(n,exp-1);
}
public static void  main(String[] args)
{
Scanner inn=new Scanner(System.in);
Power obj=new Power();	
	System.out.println("enter the number");
	int n =inn.nextInt();
	System.out.println("enter the exponent");
	int exp=inn.nextInt();
System.out.println(obj.p(n,exp));

}
}

