import java.util.Scanner;
class Line{
public static void main(String[] args){
Scanner inn=new Scanner(System.in);
System.out.println("enter the coordinades of  1st point");
int x1=inn.nextInt();
int y1=inn.nextInt();
System.out.println("enter the coordinades of 2nd point");
int x2=inn.nextInt();
int y2=inn.nextInt();
System.out.println("enter the coordinades of 3rd point");
int x3=inn.nextInt();
int y3=inn.nextInt();

int slope1;
int slope2;
int slope3;
slope1=y2-y1/x2-x1;
	slope2=y3-y2/x3-x2;
	slope3=y1-y3/x1-x3;
	if(slope1==slope2&&slope2==slope3)
System.out.println("points fall on straight line");
	else
	System.out.println("invalid");


}
}
