class S2{
void m(S2 obj){
System.out.println(&quot;Method is invoked&quot;);
}
void p(){
m(this);
}
}
class Test{
public static void main(String[] args){
S2 obj=new S2();
obj.p();
}
}