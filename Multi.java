import java.util.Scanner;

class Recursion{
int sum(int n)
{

	if(n==0)
	{
	
	return 0;
}
	return n+sum(n-1);
	
}

public static void main(String[] args)
{
 Scanner inn=new Scanner(System.in);
 Recursion obj=new Recursion();
{
	
	cout<<"enter the number"<<endl;
	cin>>n;
	
	
cout<<sum(n)<<endl;
}
}



