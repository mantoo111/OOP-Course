import java.util.Scanner;
class Add{
int sum(int n)
{

	if(n==0)
	{
	
	return 0;
}
	return n+sum(n-1);
	
}
public static void  main(String[] args)
{
Scanner inn=new Scanner(System.in);
Add obj=new Add();	
	System.out.println("enter the number");
	int n =inn.nextInt();
	
	
System.out.println(obj.sum(n));
}
}

