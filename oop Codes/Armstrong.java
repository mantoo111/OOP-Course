import java.util.Scanner;
class Armstrong{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);
int n,i,r,sum;
	for(i=111;i<=900;i++)
	{
		sum=0;
		n=i;
		while(n>0)
		{
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
		}
		if(i==sum)
		System.out.println(i);
	}
}
}