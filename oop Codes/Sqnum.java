class Sqnum{
int a=2;
int b=3;
void square()
{
	a= a*a;

	b = b*b;
System.out.println(a+" "+b);
}

public static void main(String[] args)
{
	Sqnum obj=new Sqnum();
obj.a=5;
System.out.println(obj.a);
obj.b=7;
System.out.println(obj.b);
	
	obj.square();
		}
}
		

