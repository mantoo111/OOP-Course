import java.util.Scanner;

class Table{
void multiplication (int n);
public static void main(String[] args)
{
 Scanner inn=new Scanner(System.in);
 Table obj=new Table();

System.out.println("Please Enter table of=");
int n=inn.nextInt();
obj.multiplication (n);
}
 
 
void multiplication (int n)
{ 
for(int i=12;i>=1;i--)
{
 System.out.println(n+" * "+i+" = "+n * i);	
  }
}
}