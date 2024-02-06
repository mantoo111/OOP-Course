import java.util.Scanner;
class Totalnum{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);

int pos=0;
	int neg=0;
	int zer=0;
System.out.println("Enter the number");
		int num=inn.nextInt();
for(int i=num;i<=10;i++){
		

	if(num>0){

		pos++;
	}
		 else if(num<0){
		neg++;
}
		else
		{
			zer++;
}
}
		
		
		
		System.out.println("total positive numbers are"+pos);
		System.out.println("total negative  numbers are"+neg);
		System.out.println("total zero numbers are"+zer);

		
}
}
	


