import java.util.Scanner;
class Time{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);

	System.out.println("Enter the time taken =");
	int hour=inn.nextInt();
	if(hour<=2)
	System.out.println("then the worker is highly efficient");
	else if(hour>=2 && hour<=3)
	System.out.println("then the worker is ordered to improve speed");
	else if(hour>=3&&hour<=4)
	System.out.println("the worker is given training to improve his speed");
	else if(hour>=4&&hour<=5)
	System.out.println("then a final warning letter should be issued");
	else
	System.out.println("worker has to leave the company");
	



}
}
